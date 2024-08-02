import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        // Calculate sum using a for loop
        for (int i = 1; i <= 4; i++) {
            int term = n;
            for (int j = 1; j < i; j++) {
                term *= n;
            }
            sum += (n + term);
        }
        
        // Print result
        System.out.println("The result is: " + sum);
    }
}
