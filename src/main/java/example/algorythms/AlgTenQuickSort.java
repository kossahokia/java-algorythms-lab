package example.algorythms;

import java.util.ArrayList;
import java.util.List;

public class AlgTenQuickSort {
    public static void main(String[] args) {
        List<Integer> sourceList = List.of(5, 12, 45, 98, 12, 90, 14, 101, 86, 34, 48, 52, 9);
        System.out.println(quickSort(sourceList));
    }

    public static List<Integer> quickSort(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        }
        int pivotIndex = array.size() / 2;
        Integer pivot = array.get(pivotIndex);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            if (i == pivotIndex) {
                continue;
            } else if (array.get(i) <= pivot) {
                left.add(array.get(i));
            } else {
                right.add(array.get(i));
            }
        }
        List<Integer> sortedLeft = quickSort(left);
        List<Integer> sortedRight = quickSort(right);
        List<Integer> result = new ArrayList<>();
        result.addAll(sortedLeft);
        result.add(pivot);
        result.addAll(sortedRight);
        return result;
    }
}
