import java.util.Arrays;

public class ArrayBinarySearchExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int index = Arrays.binarySearch(a, 3);
        System.out.println("Index of 3: " + index); // Prints: Index of 3: 2
    }
}
