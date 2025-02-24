package ru.otus.homework3;

public class Main {

    public static void main(String[] args) {

        Methods methods = new Methods();

        int[][] arr1 = {
                {1, -2, 0},
                {10, -15, 2, 18},
                {-2, -8, -15, 2, 22}
        };
        System.out.println("Задача 1. Сумма элементов массива больше 0: " + methods.sumOfPositiveElemenets(arr1));
        methods.printSquare(3);
        methods.printSquare(6);
        if (!methods.printZeroDiagonals(2, arr1)) {
            System.out.println("Невозможно распечатать диагональ: матрица не квадратная.");
        }
        int[][] arr2 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        methods.printZeroDiagonals(1, arr2);
        int[][] arr3 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        methods.printZeroDiagonals(2, arr3);
        int[][] arr4 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        methods.printZeroDiagonals(3, arr4);
        System.out.println(methods.findMax(arr1));
        System.out.println(methods.findMax(arr2));
        int[][] arr5 = {
                {1, 2, 3, 4, 5}
        };
        System.out.println(methods.sumOfSecondRow(arr5));
        System.out.println(methods.sumOfSecondRow(arr1));
    }
}
