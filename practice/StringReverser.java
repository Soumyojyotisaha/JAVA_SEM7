public class StringReverser {

    // Method to reverse a given string
    public static String reverse(String text) {
        // Convert the string to a character array
        char[] c = text.toCharArray();
        
        // Reverse the characters in the array
        for (int k = 0; k < c.length / 2; k++) {
            int k2 = c.length - k - 1; // Index from the end of the array
            char temp = c[k]; // Temporary variable for swapping
            c[k] = c[k2];    // Swap characters
            c[k2] = temp;    // Swap characters
        }
        
        // Create a new string from the reversed character array
        return new String(c);
    }

    // Main method to test the reverse method
    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"hello", "world", "Java", "12345", "racecar"};

        for (String s : testStrings) {
            // Print the original and reversed strings
            String reversed = reverse(s);
            System.out.println("Original: " + s);
            System.out.println("Reversed: " + reversed);
            System.out.println(); // Empty line for better readability
        }
    }
}
