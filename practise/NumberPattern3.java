public class NumberPattern3 {
    public static void main(String[] args) {
        int totalRows = 4; // Number of rows for the increasing part

        // Print the increasing part
        for (int i = 1; i <= totalRows; i++) {
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Move to the next line
            System.out.println();
        }

        // Print the decreasing part
        for (int i = totalRows - 1; i >= 1; i--) {
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
// 123
// 12
// 1
