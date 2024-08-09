public class DuplicateFinder {
    public static void main(String[] args) {
        // Declare and initialize a string array 'my_array'.
        String[] my_array = {"apple", "mango", "banana", "apple", "orange", "mango", "guava"};
        
        // Array to track elements that have been checked as duplicates.
        boolean[] printed = new boolean[my_array.length];

        // Iterate through the elements of the string array.
        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                // Check if two string elements are equal and not the same element.
                if (my_array[i].equals(my_array[j]) && !printed[j]) {
                    // Print the duplicate element and mark it as printed.
                    System.out.println("Duplicate Element is : " + my_array[j]);
                    printed[j] = true;  // Mark this element as processed.
                }
            }
        }
    }    
}
