public class addition {
    public static void main(String[] args) {
        // Initialize the 2D arrays
        int a[][] = {{1, 3, 4}, {3, 4, 5}};
        int b[][] = {{1, 3, 4}, {3, 4, 5}};
        int c[][] = new int[2][3]; // Array to store the result of the addition

        // Loop through each element of the arrays
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j]; // Add corresponding elements of a and b
                System.out.print(c[i][j] + " "); // Print the result
            }
            System.out.println(); // Move to the next line after printing one row
        }
    }
}
