package ru.otus.homework7.domain;

import java.util.Arrays;
import java.util.List;

import static ru.otus.homework7.domain.Terrain.FOREST;
import static ru.otus.homework7.domain.Terrain.MARSH;

public class Horse implements Transport {

    private List<Terrain> prohibitedTerrains = Arrays.asList(MARSH);
    private final int STAMINA = 65;
    private final double STAMINA_CONSUMPTION_PER_KM = 2;
    private int currentStamina = STAMINA;

    @Override
    public boolean move(double distance, Terrain terrain) {

        if (prohibitedTerrains.contains(terrain)) {
            return false;
        }

        if (getConsumption(distance) > currentStamina) {
            return false;
        }

        currentStamina -= getConsumption(distance);
        return true;
    }

    private double getConsumption(double distance) {
        return distance * STAMINA_CONSUMPTION_PER_KM;
    }
}
