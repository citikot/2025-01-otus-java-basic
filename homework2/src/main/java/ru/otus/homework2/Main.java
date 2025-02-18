package ru.otus.homework2;

public class Main {

    public static void main(String[] args) {

        Methods methods = new Methods();

        System.out.println("Домашняя работа номер 2. Массивы.");
        final int N = 4;
        String str = "Задача 1";
        int[] arr2 = {3, 5, 7, 56, 67, 435, 9, 564, 567, 345, -12, 1, 0, -8};
        methods.printStringNTimes(N, str);
        methods.printSum(arr2);
        methods.fillArray(N, arr2);
        int[] arr3 = {3, 5, 7, 56, 67, 435, 9, 564, 567, 345, -12, 1, 0, -8};
        methods.addDelta(N, arr3);
        int[] arr4 = {1, 2, 3, 4, 5, 6};
        methods.printLargeHalf(arr4);
        int[] arr5 = {4, 5, 6, 1, 2, 3};
        methods.printLargeHalf(arr5);
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7};
        methods.printLargeHalf(arr6);
        int[] arr7 = {4, 5, 6, 7, 1, 2, 3};
        methods.printLargeHalf(arr7);
        int[] arr9 = {1,2,3,4};
        for (int elem : methods.arrayReverse(arr9)) {
            System.out.print(elem + " ");
        }
        System.out.println();
        int[] arr10 = {1,2,3,4,5};
        for (int elem : methods.arrayReverse(arr10)) {
            System.out.print(elem + " ");
        }
        System.out.println();
        int[] arr11 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr12 = {4, 5, 6, 7, 1, 2, 3};
        int[] arr13 = {7, 6, 5, 4, 3, 2, 1};
        methods.printIsArraySorted(methods.isArraySorted("asc", arr11));
        methods.printIsArraySorted(methods.isArraySorted("desc", arr11));
        methods.printIsArraySorted(methods.isArraySorted("asc", arr12));
        methods.printIsArraySorted(methods.isArraySorted("asc", arr13));
        methods.printIsArraySorted(methods.isArraySorted("desc", arr13));
        int[] arr14 = {1, 2, 3};
        int[] arr15 = {2, 2};
        int[] arr16 = {1, 1, 1, 1, 1};
        int[] arr17 = {2, 2, 2, 2, 2, 2};
        int[] arr18 = methods.arrayReduce(arr14, arr15, arr16, arr17);
        for (int elem : arr18) {
            System.out.print(elem + " ");
        }
        System.out.println();
        int[] arr19 = {1, 2, 3};
        int[] arr20 = {1, 1, 1, 1, 1, 5};
        int[] arr21 = {5, 3, 4, -2};
        int[] arr22 = {4, 3, 2, 2, 2, 1};
        int[] arr23 = {7, 2, 2, 2};
        int[] arr24 = {9, 4};
        int[] arr25 = {6};
        methods.balancePoint(arr19);
        methods.balancePoint(arr20);
        methods.balancePoint(arr21);
        methods.balancePoint(arr22);
        methods.balancePoint(arr23);
        methods.balancePoint(arr24);
        methods.balancePoint(arr25);
    }

}
