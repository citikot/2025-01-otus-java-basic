package ru.otus.homework7;

import ru.otus.homework7.domain.Atv;
import ru.otus.homework7.domain.Bike;
import ru.otus.homework7.domain.Car;
import ru.otus.homework7.domain.Horse;
import ru.otus.homework7.domain.Human;
import ru.otus.homework7.domain.Terrain;
import ru.otus.homework7.domain.Transport;

public class Main {

    public static void main(String[] args) {
        System.out.println("Домашнее задание 7.");
        System.out.println("==================");

        Transport atv1 = new Atv(120, 0.125);
        Transport bike1 = new Bike(List.of())
        Human p1 = new Human("Ivan");
        printMove(p1.move(4, Terrain.FLATLAND));
        p1.setCurrentTransport(new Bike());
        printMove(p1.move(5,Terrain.FOREST));
        p1.setCurrentTransport(null);
        printMove(p1.move(6, Terrain.MARSH));

        Human p2 = new Human("John", atv1);
        printMove(p2.move(10, Terrain.MARSH));
        printMove(p2.move(100, Terrain.MARSH));
        p2.setCurrentTransport(new Horse());
        printMove(p2.move(25, Terrain.FLATLAND));
        printMove(p2.move(25, Terrain.FOREST));
        p2.setCurrentTransport(new Car());
        printMove(p2.move(50, Terrain.MARSH));
        p2.setCurrentTransport(new Bike());
        printMove(p2.move(50, Terrain.MARSH));
        printMove(p2.move(5, Terrain.FOREST));
    }

    private static void printMove(boolean moved) {
        System.out.println(moved ? "Перемещение удалось" : "Перемещение не удалось");
    }
}
