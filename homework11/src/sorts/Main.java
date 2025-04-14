package src.sorts;

import static src.sorts.SortingService.bubbleSort;
import static src.sorts.SortingService.printArray;
import static src.sorts.SortingService.quickSort;

public class Main {

    SortingService sortingService = new SortingService();

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Сортировка пузырьком.");

        System.out.println("Исходный массив:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Отсортированный массив:");
        printArray(array);

        System.out.println();
        System.out.println("Рекурсивная сортировка слиянием. Асимптотическая сложность O (N log N)");

        int[] array1 = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Исходный массив:");
        printArray(array1);

        quickSort(array1, 0, array.length - 1);

        System.out.println("Отсортированный массив:");
        printArray(array1);
    }
}
