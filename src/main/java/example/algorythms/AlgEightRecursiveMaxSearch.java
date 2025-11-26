package example.algorythms;

public class AlgEightRecursiveMaxSearch {
    public static void main(String[] args) {
        int[] array = {1, 15, -20, 36, 150, 2, 4, 86, 29, 66};
        System.out.println(recursiveMaxSearch(array, 0));
    }

    public static int recursiveMaxSearch(int[] array, int index) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        return array.length - 1 == index ? array[index] : Math.max(array[index],
            recursiveMaxSearch(array, index + 1));
    }
}
