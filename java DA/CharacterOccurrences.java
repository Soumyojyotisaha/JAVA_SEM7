import java.util.Scanner;

public class CharacterOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to count: ");
        char ch = sc.next().charAt(0);
        int count = str.length() - str.replace(String.valueOf(ch), "").length();
        System.out.println("Total occurrences of '" + ch + "' = " + count);
    }
}
