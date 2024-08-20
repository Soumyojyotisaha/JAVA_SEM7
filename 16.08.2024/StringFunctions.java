import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;
        int choice;

        System.out.println("\nMenu:");
        System.out.println("1. Append a string to the end of another string");
        System.out.println("2. Convert a string to lower case");
        System.out.println("3. Convert a string to upper case");
        System.out.println("4. Return the length of a string");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter the first string: ");
                str1 = scanner.nextLine();
                System.out.print("Enter the string to append: ");
                str2 = scanner.nextLine();
                System.out.println("Result: " + str1 + str2);
                break;

            case 2:
                System.out.print("Enter a string: ");
                str1 = scanner.nextLine();
                System.out.println("Lowercase: " + str1.toLowerCase());
                break;

            case 3:
                System.out.print("Enter a string: ");
                str1 = scanner.nextLine();
                System.out.println("Uppercase: " + str1.toUpperCase());
                break;

            case 4:
                System.out.print("Enter a string: ");
                str1 = scanner.nextLine();
                System.out.println("Length: " + str1.length());
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
        }

        scanner.close();
    }
}
