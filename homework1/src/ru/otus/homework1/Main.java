package ru.otus.homework1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.print("Введите число от 1 дло 5 для вызова метода, любое другое - для выхода из программы: ");
            int input = scanner.nextInt();
            System.out.println();
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            int c = (int) (Math.random() * -100);
            boolean increment = (int) (Math.random() * 100) > 50;
            switch (input) {
                case 1 -> methods.greetings();
                case 2 -> methods.checkSign(a, b, c);
                case 3 -> methods.selectColor();
                case 4 -> methods.compareNumbers();
                case 5 -> methods.addOrSubtractAndPrint(a, b, increment);
                default -> exit = true;
            }
        } while (!exit);
    }
}
