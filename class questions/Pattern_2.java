import java.util.*;
public class Pattern_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Loop for rows
            for (int j = 0; j <=i; j++) { // Loop for columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

// *
// **
// ***
// ****
// *****