import java.util.Arrays;

public class ArraySortRangeExample {
    public static void main(String[] args) {
        int[] a = {4, 2, 3, 1};
        Arrays.sort(a, 1, 3); // Sorts elements from index 1 to 2
        System.out.println("Array after partial sort: " + Arrays.toString(a)); // Prints: [4, 1, 2, 3]
    }
}
