package ru.otus.homework8;

import ru.otus.homework8.exception.AppArrayDataException;
import ru.otus.homework8.exception.AppArraySizeException;

public class Main {

    private static final int ARRAY_SIZE = 4;

    public static void main(String[] args) throws InterruptedException {

        String[][] arrCorrect = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        String[][] arrWrongLines = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        String[][] arrWrongColumns = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5", "6"},
                {"1", "2", "3", "4"}};

        String[][] arrWrongElement = {{"1", "2", "3", "4"},
                {"1", "two", "3", "4"},
                {"1", "2", "three", "4"},
                {"1", "2", "3", "4"}};

        try {
            int sum = calculateArraySum(arrCorrect);
            System.out.println("Sum of array elements: " + sum);
        } catch (AppArraySizeException | AppArrayDataException e) {
            e.printStackTrace();
        }
        try {
            int sum = calculateArraySum(arrWrongLines);
            System.out.println("Sum of array elements: " + sum);
        } catch (AppArraySizeException | AppArrayDataException e) {
            e.printStackTrace();
        }
        try {
            int sum = calculateArraySum(arrWrongColumns);
            System.out.println("Sum of array elements: " + sum);
        } catch (AppArraySizeException | AppArrayDataException e) {
            e.printStackTrace();
        }
        try {
            int sum = calculateArraySum(arrWrongElement);
            System.out.println("Sum of array elements: " + sum);
        } catch (AppArraySizeException | AppArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int calculateArraySum(String[][] arr) {

        if (arr.length != ARRAY_SIZE) {
            throw new AppArraySizeException("Array length must be equal " + ARRAY_SIZE);
        }

        int sum = 0;

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (arr[i].length != ARRAY_SIZE) {
                throw new AppArraySizeException("Length of sub array at line " + i + " must be equal " + ARRAY_SIZE);
            }
            for (int j = 0; j < ARRAY_SIZE; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Element at the line " + i + ", column " + j + " cannot be casted to integer value");
                }
            }
        }
        return sum;
    }
}
