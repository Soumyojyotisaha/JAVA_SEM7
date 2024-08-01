public class NumberPattern2 {
    public static void main(String[] args) {
        int totalRows = 4; // Total number of rows in the pattern

        for (int i = 0; i <totalRows; i++) {
            // Print numbers
            for (int j = 1; j <= totalRows-i; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }
}

// 1234
// 123
// 12
// 1