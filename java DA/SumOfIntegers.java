import java.util.Scanner;

class Sum {
    int sum = 0;

    Sum(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println("Sum of the numbers: " + sum);
        sc.close();
    }
}

public class SumOfIntegers {
    public static void main(String[] args) {
        new Sum(5); // Example: Finding the sum of 5 integers
    }
}
