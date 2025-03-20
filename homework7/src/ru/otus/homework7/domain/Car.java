package ru.otus.homework7.domain;

import java.rmi.MarshalException;
import java.util.Arrays;
import java.util.List;

import static ru.otus.homework7.domain.Terrain.FOREST;
import static ru.otus.homework7.domain.Terrain.MARSH;

public class Car implements Transport {

    private List<Terrain> prohibitedTerrains = Arrays.asList(FOREST, MARSH);

    @Override
    public boolean move(double distance, Terrain terrain) {

        if (prohibitedTerrains.contains(terrain)) {
            return false;
        }

        return true;
    }
}
