import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Append a string");
        System.out.println("2. Convert to lower case");
        System.out.println("3. Convert to upper case");
        System.out.println("4. Length of string");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter string to append: ");
                String appendStr = sc.nextLine();
                System.out.println("Result: " + str + appendStr);
                break;
            case 2:
                System.out.println("Result: " + str.toLowerCase());
                break;
            case 3:
                System.out.println("Result: " + str.toUpperCase());
                break;
            case 4:
                System.out.println("Length: " + str.length());
                break;
            default:
                System.out.println("Invalid option.");
        }
        sc.close();
    }
}
