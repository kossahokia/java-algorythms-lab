package example.algorythms;

import java.util.OptionalInt;

public class AlgNineRecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 12, 14, 17, 20, 22, 25, 31, 36};
        int item = 3;
        recursiveBinarySearch(array, item, 0, array.length - 1).ifPresentOrElse(
            index -> System.out.println("Значение '" + item + "' найдено на позиции: " + index),
            () -> System.out.println("Значение не найдено")
        );
    }

    public static OptionalInt recursiveBinarySearch(int[] array, int item, int low, int high) {
        if (high < low) {
            return OptionalInt.empty();
        }

        int mid = low + (high - low) / 2;

        if (array[mid] == item) {
            return OptionalInt.of(mid);
        } else if (array[mid] > item) {
            return recursiveBinarySearch(array, item, low, mid - 1);
        } else {
            return recursiveBinarySearch(array, item, mid + 1, high);
        }
    }
}