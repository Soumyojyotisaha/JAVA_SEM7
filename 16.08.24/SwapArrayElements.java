import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};

        // Ensure the array has at least 7 elements
        if (array.length < 7) {
            System.out.println("Array length is less than 7.");
            return;
        }

        // Swapping the first and last elements
        int[] swappedArray = Arrays.copyOf(array, array.length);
        int temp = swappedArray[0];
        swappedArray[0] = swappedArray[swappedArray.length - 1];
        swappedArray[swappedArray.length - 1] = temp;

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Swapped array: " + Arrays.toString(swappedArray));
    }
}
