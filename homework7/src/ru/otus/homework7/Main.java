package ru.otus.homework7;

import ru.otus.homework7.domain.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Домашнее задание 7.");
        System.out.println("==================");

        Transport atv1 = new Atv(120, 0.125);
        Transport bike1 = new Bike(List.of(Terrain.MARSH));
        Transport car1 = new Car(65, 0.08, List.of(Terrain.FOREST, Terrain.MARSH));
        Transport horse1 = new Horse(35, 3, List.of(Terrain.MARSH));

        Human p1 = new Human("Ivan");
        printMove(p1.move(-3, Terrain.FOREST));
        printMove(p1.move(4, Terrain.FLATLAND));
        p1.setCurrentTransport(bike1);
        printMove(p1.move(5, Terrain.FOREST));
        printMove(p1.move(-10, Terrain.FOREST));
        p1.setCurrentTransport(null);
        printMove(p1.move(6, Terrain.MARSH));
        printMove(p1.move(-1, Terrain.MARSH));

        Human p2 = new Human("John", atv1);
        printMove(p2.move(10, Terrain.MARSH));
        printMove(p2.move(-1, Terrain.MARSH));
        printMove(p2.move(100, Terrain.MARSH));
        p2.setCurrentTransport(horse1);
        printMove(p2.move(7, Terrain.FLATLAND));
        printMove(p2.move(-1, Terrain.FLATLAND));
        printMove(p2.move(25, Terrain.FOREST));
        p2.setCurrentTransport(car1);
        printMove(p2.move(50, Terrain.MARSH));
        printMove(p2.move(50, Terrain.FLATLAND));
        printMove(p2.move(-1, Terrain.FLATLAND));
        printMove(p2.move(50, Terrain.FOREST));
        p2.setCurrentTransport(bike1);
        printMove(p2.move(50, Terrain.MARSH));
        printMove(p2.move(5, Terrain.FOREST));
    }

    private static void printMove(boolean moved) {
        System.out.println(moved ? "Перемещение удалось" : "Перемещение не удалось");
    }
}
