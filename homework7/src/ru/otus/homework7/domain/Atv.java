package ru.otus.homework7.domain;

public class Atv extends Vehicle {

    public Atv(double capacity, double consumption) {
        this.capacity = capacity;
        this.consumption = consumption;
        this.prohibitedTerrains = null;
        this.currentCapacity = capacity;
    }

    @Override
    public boolean move(Human person, double distance, Terrain terrain) {

        if (getConsumption(distance) > currentCapacity) {
            System.out.println(String.format("В вездеходе не хватит топлива на дистанцию %.2f км.", distance));
            return false;
        }

        currentCapacity -= getConsumption(distance);
        System.out.println(String.format("%s проехал на вездеходе %.2f км по местности: %s. В баке осталось %.2f л топлива.",
                person.getName(), distance, terrain.getName(), currentCapacity));
        return true;
    }

}
