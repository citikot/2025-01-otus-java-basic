package ru.otus.homework7.domain;

import java.util.List;

public abstract class Vehicle implements Transport {
    double capacity;
    double consumption;
    double currentCapacity;
    List<Terrain> prohibitedTerrains;

    public double getConsumption(double distance) {
        if (distance <= 0) {
            return 0;
        }
        return distance * consumption;
    }
}
