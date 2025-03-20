package ru.otus.homework7.domain;

public class Atv implements Transport {

    private final int FUEL_CAPACITY = 120;
    private final double FUEL_CONSUMPTION_PER_KM = 0.125;
    private int currentFuel = FUEL_CAPACITY;

    @Override
    public boolean move(double distance, Terrain terrain) {
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
