package ru.otus.homework7.domain;

public class Atv implements Transport {

    @Override
    public boolean move(double distance, Terrain terrain) {
        return true;
    }
}
