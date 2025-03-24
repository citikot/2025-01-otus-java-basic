package ru.otus.homework7.domain;

public interface Transport {

    boolean move(Human person, double distance, Terrain terrain);
}
