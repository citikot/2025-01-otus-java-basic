package ru.otus.homework1;

public class Methods {

    public void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public void checkSign(int a, int b, int c) {
        if (sum(a, b, c) >= 0) {
            System.out.println("Сумма положительная.");
        } else {
            System.out.println("Cумма отрицательная.");
        }
    }

    private int sum(int a, int b, int c) {
        return a + b + c;
    }

    public void selectColor() {
        int data = (int) (Math.random() * 30);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public void compareNumbers() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
