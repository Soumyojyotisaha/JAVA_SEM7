import java.util.*;
public class Pattern_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Loop for rows
            for (int j = 5; j > i; j--) { // Loop for columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

// *****
// ****
// ***
// **
// *

    

