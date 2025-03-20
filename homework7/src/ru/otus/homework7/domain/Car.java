package ru.otus.homework7.domain;

import java.rmi.MarshalException;
import java.util.Arrays;
import java.util.List;

import static ru.otus.homework7.domain.Terrain.FOREST;
import static ru.otus.homework7.domain.Terrain.MARSH;

public class Car extends Vehicle {

    public Car(double capacity, double consumption, List<Terrain> prohibitedTerrains) {
        this.capacity = capacity;
        this.consumption = consumption;
        this.prohibitedTerrains = prohibitedTerrains;
        this.currentCapacity = capacity;
    }

    @Override
    public boolean move(Human person, double distance, Terrain terrain) {

        if (prohibitedTerrains.contains(terrain)) {
            System.out.println(String.format("Машина не может ехать по местности: %s. Смените транспорт или идите пешком.", terrain.getName()));
            return false;
        }

        if (getConsumption(distance) > currentFuel) {
            System.out.println(String.format("В машине не хватит топлива на дистанцию %.2f км.", distance));
            return false;
        }

        currentFuel -= getConsumption(distance);
        System.out.println(String.format("%s проехал на машине %.2f км по местности: %s. В машине осталось %.2f л топлива.",
                person.getName(), distance, terrain.getName(), currentFuel));
        return true;
    }

    private double getConsumption(double distance) {
        return distance * FUEL_CONSUMPTION_PER_KM;
    }
}
