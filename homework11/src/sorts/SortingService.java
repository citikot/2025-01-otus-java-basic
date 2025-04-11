package src.sorts;

public class SortingService {

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Внутренний цикл: уменьшаем количество сравнений с каждым проходом
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен значениями между array[j] и array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            quickSort(array, left, middle);
            quickSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
    private static void merge(int[] array, int left, int middle, int right) {
        // Определяем размеры подмассивов
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Создаем временные массивы
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Копируем данные во временные массивы
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Индексы для временных массивов и исходного массива
        int i = 0, j = 0, k = left;

        // Слияние временных массивов обратно в array[от left до right]
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Копирование оставшихся элементов из leftArray, если такие есть
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Копирование оставшихся элементов из rightArray, если такие есть
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
