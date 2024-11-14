import java.util.*;
import java.io.*; // Required for File and FileNotFoundException

public class ExceptionHandlingExamples {
    public static void main(String[] args) {
        // Example 1: Division by Zero
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        // Example 2: Array Index Out of Bounds
        try {
            int[] arr = new int[5];
            arr[10] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }

        // Example 3: Null Pointer Exception
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer encountered.");
        }

        // Example 4: Number Format Exception
        try {
            int num = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }

        // Example 5: File Not Found Exception
        try {
            File file = new File("nonexistent.txt");
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
