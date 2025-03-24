package ru.otus.homework7.domain;

import java.util.List;

public class Car extends Vehicle {

    public Car(double capacity, double consumption, List<Terrain> prohibitedTerrains) {
        this.capacity = capacity;
        this.consumption = consumption;
        this.prohibitedTerrains = prohibitedTerrains;
        this.currentCapacity = capacity;
    }

    @Override
    public boolean move(Human person, double distance, Terrain terrain) {

        if (distance < 0) {
            System.out.println("Значение дистанции для преодоления должно быть положительным.");
            return false;
        }

        if (prohibitedTerrains.contains(terrain)) {
            System.out.println(String.format("Машина не может ехать по местности: %s. Смените транспорт или идите пешком.", terrain.getName()));
            return false;
        }

        if (getConsumption(distance) > currentCapacity) {
            System.out.println(String.format("В машине не хватит топлива на дистанцию %.2f км.", distance));
            return false;
        }

        currentCapacity -= getConsumption(distance);
        System.out.println(String.format("%s проехал на машине %.2f км по местности: %s. В машине осталось %.2f л топлива.",
                person.getName(), distance, terrain.getName(), currentCapacity));
        return true;
    }
}
