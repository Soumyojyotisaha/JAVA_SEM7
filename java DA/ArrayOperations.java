import java.util.*;
public class ArrayOperations {
    public static void main(String[] args) {
        int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};
        int[] resultArray = new int[array1.length];

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i] * array2[i];
        }

        System.out.println("Result Array: " + Arrays.toString(resultArray));
    }
}
