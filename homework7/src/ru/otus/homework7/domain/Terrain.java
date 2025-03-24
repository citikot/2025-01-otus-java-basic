package ru.otus.homework7.domain;

public enum Terrain {

    FOREST("темный лес"),
    FLATLAND("равнина"),
    MARSH("болото");

    private String name;

    Terrain(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
