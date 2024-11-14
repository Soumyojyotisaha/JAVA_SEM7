import java.util.Scanner;

public class CompareStringsIgnoreCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();
        boolean areEqual = str1.equalsIgnoreCase(str2);
        System.out.println("Strings are equal (ignoring case): " + areEqual);
    }
}
