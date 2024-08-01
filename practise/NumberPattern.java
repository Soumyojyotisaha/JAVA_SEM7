public class NumberPattern {
    public static void main(String[] args) {
        int totalRows = 7; // Total number of rows in the pattern

        for (int i = 1; i <= totalRows; i++) {
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}


// 1   
// 12
// 123
// 1234
// 12345
// 123456
// 1234567
