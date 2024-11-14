import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length);

        // Swap first and last elements
        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}

