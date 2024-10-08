import java.util.Arrays;

public class MultiplyArrays {
    public static void main(String[] args) {
        int[] array1 = {4, 3, -5, 1};
        Arrays.sort(array1, 0,2);
        int[] array2 = {1, 4, -5, -2};

        int[] resultArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i] * array2[i];
        }

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Result Array: " + Arrays.toString(resultArray));
    }
}
