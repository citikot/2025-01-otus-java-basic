package ru.otus.homework7.domain;

import java.util.List;

public class Bike extends Vehicle {

    public Bike(List<Terrain> prohibitedTerrains) {
        this.prohibitedTerrains = prohibitedTerrains;
    }

    @Override
    public boolean move(Human person, double distance, Terrain terrain) {

        if (distance < 0) {
            System.out.println("Значение дистанции для преодоления должно быть положительным.");
            return false;
        }

        if (prohibitedTerrains.contains(terrain)) {
            System.out.println(String.format("Велосипед не может ехать по местности: %s. Смените транспорт или идите пешком.", terrain.getName()));
            return false;
        }

        if (person.getConsumption(distance) > person.getCurrentStamina()) {
            System.out.println(String.format("У человека нет столько сил, чтобы проехать на велосипеде дистанцию %.2f км.", distance));
            return false;
        }

        person.setCurrentStamina(person.getCurrentStamina() - person.getConsumption(distance));
        System.out.println(String.format("%s проехал на велосипеде %.2f км по местности: %s. У него осталось %.2f единиц силы.",
                person.getName(), distance, terrain.getName(), person.getCurrentStamina()));
        return true;
    }
}
