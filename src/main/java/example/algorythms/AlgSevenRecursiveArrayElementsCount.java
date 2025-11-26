package example.algorythms;

public class AlgSevenRecursiveArrayElementsCount {
    public static void main(String[] args) {
        int[] array = {5, 7, 12, 3, 11};
        System.out.println(elementCont(array, 0));
    }

    public static int elementCont(int[] array, int index) {
        return index == array.length ? 0 : 1 + elementCont(array, index + 1);
    }
}