package ru.otus.homework7.domain;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

import static ru.otus.homework7.domain.Terrain.FOREST;
import static ru.otus.homework7.domain.Terrain.MARSH;

public class Horse extends Vehicle {

    public Horse(double capacity, double consumption, List<Terrain> prohibitedTerrains) {
        this.capacity = capacity;
        this.consumption = consumption;
        this.prohibitedTerrains = prohibitedTerrains;
        this.currentCapacity = capacity;
    }

    @Override
    public boolean move(Human person, double distance, Terrain terrain) {

        if (prohibitedTerrains.contains(terrain)) {
            System.out.println(String.format("Лошадь не может скакать по местности: %s. Смените транспорт или идите пешком.", terrain.getName()));
            return false;
        }

        if (getConsumption(distance) > currentStamina) {
            System.out.println(String.format("У лошади нет столько сил, чтобы проскакать дистанцию %.2f км.", distance));
            return false;
        }

        currentStamina -= getConsumption(distance);
        System.out.println(String.format("%s проскакал на лошади %.2f км по местности: %s. У лошади осталось %.2f единиц силы.",
                person.getName(), distance, terrain.getName(), currentStamina));
        return true;
    }

    private double getConsumption(double distance) {
        return distance * STAMINA_CONSUMPTION_PER_KM;
    }
}
