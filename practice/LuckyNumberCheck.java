import java.util.Scanner;

public class LuckyNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luckyNumber = 13;
        boolean isLucky = false;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt();
            
            if (userInput == luckyNumber) {
                System.out.println("You are a lucky winner!");
                isLucky = true;
                break; // Exit the loop if lucky number is entered
            }
        }
        
        if (!isLucky) {
            System.out.println("You are unlucky.");
        }
        
        scanner.close();
    }
}
