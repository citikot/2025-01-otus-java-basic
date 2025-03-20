package ru.otus.homework7.domain;

import java.rmi.MarshalException;
import java.util.Arrays;
import java.util.List;

import static ru.otus.homework7.domain.Terrain.FOREST;
import static ru.otus.homework7.domain.Terrain.MARSH;

public class Car implements Transport {

    private List<Terrain> prohibitedTerrains = Arrays.asList(FOREST, MARSH);
    private final int FUEL_CAPACITY = 65;
    private final double FUEL_CONSUMPTION_PER_KM = 0.07;
    private int currentFuel = FUEL_CAPACITY;

    @Override
    public boolean move(double distance, Terrain terrain) {

        if (prohibitedTerrains.contains(terrain)) {
            return false;
        }

        if (getConsumption(distance) > currentFuel) {
            return false;
        }

        currentFuel -= getConsumption(distance);
        return true;
    }

    private double getConsumption(double distance) {
        return distance * FUEL_CONSUMPTION_PER_KM;
    }
}
