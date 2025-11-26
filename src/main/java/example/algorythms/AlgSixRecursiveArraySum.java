package example.algorythms;

import java.util.Arrays;

public class AlgSixRecursiveArraySum {
    public static void main(String[] args) {
        int[] array = {3, 2, 7, 10, 4, 1, 6};
        System.out.println(recursiveArraySum(array));
    }

    public static int recursiveArraySum(int[] array) {
        return sum(array, 0);
    }

    public static int sum(int[] array, int index){
        if (index == array.length) {
            return 0;
        }
        return array[index] + sum(array, index + 1);
    }
}