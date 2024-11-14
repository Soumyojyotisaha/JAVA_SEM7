import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        boolean isPalindrome = str.equalsIgnoreCase(reversedStr);
        System.out.println("Reversed string: " + reversedStr);
        System.out.println("Is palindrome: " + isPalindrome);
    }
}
