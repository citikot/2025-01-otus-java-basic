package ru.otus.homework3;

public class Methods {

    public int sumOfPositiveElemenets(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public void printSquare(int size) {
        System.out.println("----------------------");
        System.out.println("Задача 2");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public boolean printZeroDiagonals(int option, int[][] arr) {
        System.out.println("Задача 3");
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                return false;
            }
        }

        switch (option) {
            case 1 -> {
                createDiagLeftToRight(arr);
            }
            case 2 -> {
                createDiagRightToLeft(arr);
            }
            case 3 -> {
                createDiagLeftToRight(arr);
                createDiagRightToLeft(arr);
            }
        }
        printArray(arr);
        return true;
    }

    private void createDiagLeftToRight(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 0;
        }
    }

    private void createDiagRightToLeft(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][arr[i].length - i - 1] = 0;
        }
    }

    private void printArray(int[][] arr) {
        System.out.println("------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public int findMax(int[][] array) {
        System.out.println("Задача 4");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public int sumOfSecondRow(int[][] arr) {
        System.out.println("Задача 5");
        if (arr.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < arr[1].length; i++) {
            sum += arr[1][i];
        }
        return sum;
    }
}

