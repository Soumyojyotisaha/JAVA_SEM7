import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbersToRead = 5;
        
        for (int i = 0; i < numbersToRead; i++) {
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt();
            
            if (userInput % 2 != 0) { // Check if the number is odd
                sum += userInput; // Add odd number to sum
            }
        }
        
        System.out.println("Sum of odd numbers: " + sum);
        
        scanner.close();
    }
}
