package ru.otus.homework7.domain;

import java.util.Arrays;
import java.util.List;

import static ru.otus.homework7.domain.Terrain.FOREST;
import static ru.otus.homework7.domain.Terrain.MARSH;

public class Bike implements Transport {

    private List<Terrain> prohibitedTerrains = Arrays.asList(MARSH);

    @Override
    public boolean move(double distance, Terrain terrain) {

        if (prohibitedTerrains.contains(terrain)) {
            return false;
        }
        return true;
    }
}
