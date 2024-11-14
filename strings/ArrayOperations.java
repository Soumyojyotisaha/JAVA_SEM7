public class ArrayOperations {
    public static void main(String[] args) {
        // Aim: To add all digits in a positive integer array and multiply corresponding elements of two integer arrays.

        // Task 1: Add all digits of a positive integer array
        int[] numArray = {123, 456, 789}; // Example array
        int totalDigitSum = addAllDigits(numArray);
        System.out.println("Total sum of all digits in the array: " + totalDigitSum);

        // Task 2: Multiply corresponding elements of two integer arrays
        int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};
        int[] resultArray = multiplyCorrespondingElements(array1, array2);

        // Display the result
        System.out.print("Array1: ");
        displayArray(array1);
        System.out.print("Array2: ");
        displayArray(array2);
        System.out.print("Result array: ");
        displayArray(resultArray);
    }

    // Method to add all digits of a given positive integer array
    public static int addAllDigits(int[] array) {
        int sum = 0;
        for (int num : array) {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }

    // Method to multiply corresponding elements of two integer arrays
    public static int[] multiplyCorrespondingElements(int[] array1, int[] array2) {
        int length = Math.min(array1.length, array2.length);
        int[] resultArray = new int[length];
        
        for (int i = 0; i < length; i++) {
            resultArray[i] = array1[i] * array2[i];
        }
        
        return resultArray;
    }

    // Helper method to display an array
    public static void displayArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
