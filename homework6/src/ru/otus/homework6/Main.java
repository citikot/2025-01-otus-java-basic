package ru.otus.homework6;

import java.util.Random;

public class Main {

    private static final int NUMBER_OF_CATS = 7;
    private static final int PLATE_MAX_CAPACITY = 150;
    private static final int MAX_APPETITE = 50;

    public static void main(String[] args) {
        System.out.println("Домашняя работа 6.");
        System.out.println("------------------");

        Plate plate = new Plate(PLATE_MAX_CAPACITY, 0);
        plate.fill(PLATE_MAX_CAPACITY);
        Cat[] cats = new Cat[NUMBER_OF_CATS];
        Random random = new Random();

        for (int i = 0; i < cats.length; i++) {
            int randomAppetite = random.nextInt(MAX_APPETITE);
            String randomName = "cat" + randomAppetite;
            cats[i] = new Cat(randomName, randomAppetite);
            if (plate.consume(randomAppetite)) {
                cats[i].setFed(true);
            }
        }

        for (int i = 0; i < cats.length; i++) {
            String fedState = cats[i].isFed() ? " cыт и доволен." : " голоден и зол.";
            System.out.println("Кот " + cats[i].getName() + fedState);
        }
    }
}
