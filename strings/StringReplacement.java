public class StringReplacement {
    
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "He is good person and he is an active person.";

        // Replace all occurrences of 'fox' with 'cat'.
        String new_str = str.replaceAll("person", "boy");
       
        // Display the original and modified strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}

