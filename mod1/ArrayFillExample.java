import java.util.Arrays;
public class ArrayFillExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        Arrays.fill(a, 10);
        System.out.println("Array after fill: " + Arrays.toString(a)); // Prints: [10, 10, 10, 10]
    }
}
