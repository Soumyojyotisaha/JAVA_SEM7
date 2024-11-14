import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        
        Set<String> seen = new HashSet<>();
        System.out.println("Duplicate values:");
        for (String str : arr) {
            if (!seen.add(str)) {
                System.out.println(str);
            }
        }
    }
}
