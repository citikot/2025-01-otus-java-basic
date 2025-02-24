package ru.otus.homework2;

public class Methods {

    public void printStringNTimes(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("i = %d %s", i, str));
        }
    }

    public void printSum(int... arr) {
        System.out.println("Задача 2");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }

        System.out.println("Cумма элементов массива, которые больше 5, равна " + sum);
    }

    public void fillArray(int n, int[] arr) {
        System.out.println("Задача 3");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public void addDelta(int n, int... arr) {
        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public void printLargeHalf(int... arr) {
        System.out.println("Задача 5");
        int[] arr1;
        int[] arr2;
        int midPosition = arr.length / 2;
        if (arr.length % 2 == 0) {
            arr1 = createArray(0, midPosition - 1, arr);
        } else {
            arr1 = createArray(0, midPosition, arr);
        }
        arr2 = createArray(midPosition, arr.length - 1, arr);
        int leftSum = arrSum(arr1);
        int rightSum = arrSum(arr2);
        if (leftSum > rightSum) {
            System.out.println(String.format("Сумма левой половины %s, сумма правой половины %s, левая больше", leftSum, rightSum));
        } else {
            System.out.println(String.format("Сумма левой половины %s, сумма правой половины %s, правая больше", leftSum, rightSum));
        }
    }

    public int[] arrayReverse(int... arr) {
        System.out.println("Задача 9");
        int a;
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;
        }
        return arr;
    }

    public boolean isArraySorted(String order, int... arr) {
        System.out.println("Задача 8");
        return switch (order) {
            case "asc" -> {
                for (int i = 0; i < arr.length - 2; i++) {
                    if (arr[i] > arr[i + 1]) yield false;
                }
                yield true;
            }
            case "desc" -> {
                for (int i = 0; i < arr.length - 2; i++) {
                    if (arr[i] < arr[i + 1]) yield false;
                }
                yield true;
            }
            default -> true;
        };
    }

    public void printIsArraySorted(boolean isSorted) {
        if (isSorted) {
            System.out.println("Maccив отсортирован.");
        } else {
            System.out.println("Массив не отсортирован");
        }
    }

    public int[] arrayReduce(int[]... arr) {
        System.out.println("Задача 6");
        int[] lengths = createLengthsArray(arr);
        int maxLength = findMaxLength(lengths);
        int numberOfArraysToProcess = arr.length;
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < numberOfArraysToProcess; j++) {
                if (lengths[j] > i) {
                    result[i] += arr[j][i];
                }
            }

        }
        return result;
    }

    public void balancePoint(int[] arr) {
        System.out.println("Задача 7");
        for (int i = 0; i < arr.length - 1; i++) {
            int[] arr1 = createArray(0, i, arr);
            int[] arr2 = createArray(i + 1, arr.length - 1, arr);
            if (arrSum(arr1) == arrSum(arr2)) {
                System.out.println("Массив сбалансирован, точка баланcа между %d и %d элементами.".formatted(i, i + 1));
                return;
            }
        }
        System.out.println("Массив не сбалансирован.");
    }

    private int[] createLengthsArray(int[]... arr) {
        int[] lengths = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            lengths[i] = arr[i].length;
        }
        return lengths;
    }

    private int findMaxLength(int[] lengths) {
        int max = 0;
        for (int elem : lengths) {
            if (elem > max) max = elem;
        }
        return max;
    }

    private int[] createArray(int left, int right, int[] arr) {
        int resultLength = right - left + 1;
        int[] result = new int[resultLength];
        int index = left;
        for (int i = 0; i < resultLength; i++) {
            result[i] = arr[index];
            index++;
        }
        return result;
    }

    private int arrSum(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }
}
