public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] myArray = {
            {0, 0, 0},
            {1, 1, 1}
        };
        
        // Print the 2D array
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
