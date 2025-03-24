package ru.otus.homework7.domain;

import java.util.List;

public class Horse extends Vehicle {

    public Horse(double capacity, double consumption, List<Terrain> prohibitedTerrains) {
        this.capacity = capacity;
        this.consumption = consumption;
        this.prohibitedTerrains = prohibitedTerrains;
        this.currentCapacity = capacity;
    }

    @Override
    public boolean move(Human person, double distance, Terrain terrain) {

        if (distance < 0) {
            System.out.println("Значение дистанции для преодоления должно быть положительным.");
            return false;
        }

        if (prohibitedTerrains.contains(terrain)) {
            System.out.println(String.format("Лошадь не может скакать по местности: %s. Смените транспорт или идите пешком.", terrain.getName()));
            return false;
        }

        if (getConsumption(distance) > currentCapacity) {
            System.out.println(String.format("У лошади нет столько сил, чтобы проскакать дистанцию %.2f км.", distance));
            return false;
        }

        currentCapacity -= getConsumption(distance);
        System.out.println(String.format("%s проскакал на лошади %.2f км по местности: %s. У лошади осталось %.2f единиц силы.",
                person.getName(), distance, terrain.getName(), currentCapacity));
        return true;
    }
}
