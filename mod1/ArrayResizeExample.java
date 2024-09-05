import java.util.Arrays;

public class ArrayResizeExample {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4};
        
        // Print original array
        System.out.println("Original array: " + Arrays.toString(originalArray));
        
        // Resize the array to a larger size
        int newSize = 6;
        int[] resizedArray = resizeArray(originalArray, newSize);
        
        // Print resized array
        System.out.println("Resized array: " + Arrays.toString(resizedArray));
    }
    
    public static int[] resizeArray(int[] original, int newSize) {
        // Create a new array with the desired size
        int[] newArray = new int[newSize];
        
        // Copy the elements from the original array to the new array
        // Use Math.min to avoid ArrayIndexOutOfBoundsException
        System.arraycopy(original, 0, newArray, 0, Math.min(original.length, newSize));
        
        return newArray;
    }
}
