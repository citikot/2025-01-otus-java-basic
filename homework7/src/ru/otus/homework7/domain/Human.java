package ru.otus.homework7.domain;

public class Human {

    private String name;
    private Transport currentTransport;

    public Human(String name, Transport currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
    }

    public String getName() {
        return name;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Transport transport) {
        this.currentTransport = transport;
    }

    public boolean move(double distance, Terrain terrain) {

        if (currentTransport == null)

    }
}
