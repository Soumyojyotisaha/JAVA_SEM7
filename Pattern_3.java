public class Pattern_3 {
    public static void main(String[] args) {
        int n = 4;  // Number of levels in the pyramid

        for (int i = 1; i <= n; i++) {  // Loop for each level
            for (int j = i; j < n; j++) {  // Print leading spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {  // Print asterisks
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }
    }
}
