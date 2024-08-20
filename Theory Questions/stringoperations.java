public class stringoperations {

    // Compare addresses (references) of two strings
    public static boolean compareReferences(String str1, String str2) {
        return str1 == str2;
    }

    // Compare values of two strings
    public static boolean compareValues(String str1, String str2) {
        return str1.equals(str2);
    }

    // Compare values of two strings ignoring case
    public static boolean compareValuesIgnoreCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    // Get the length of a string
    public static int getLength(String str) {
        return str.length();
    }

    // Extract the i'th character of a string
    public static char getCharAt(String str, int i) {
        return str.charAt(i);
    }

    // Convert a string to all uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // Convert a string to all lowercase
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    // Replace occurrences of oldVal with newVal in a string
    public static String replace(String str, String oldVal, String newVal) {
        return str.replace(oldVal, newVal);
    }

    // Trim surrounding whitespace from a string
    public static String trim(String str) {
        return str.trim();
    }

    // Check if a string contains a specific substring
    public static boolean contains(String str, String value) {
        return str.contains(value);
    }

    // Convert a string to a character array
    public static char[] toCharArray(String str) {
        return str.toCharArray();
    }

    // Check if a string is empty
    public static boolean isEmpty(String str) {
        return str.isEmpty();
    }

    // Check if a string ends with a specific suffix
    public static boolean endsWith(String str, String suffix) {
        return str.endsWith(suffix);
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = new String("Welcome");
        String oldVal = "Welcome";
        String newVal = "Hello";
        int index = 3;
        String suffix = "come";

        System.out.println("Compare References: " + compareReferences(str1, str2));
        System.out.println("Compare Values: " + compareValues(str1, str2));
        System.out.println("Compare Values Ignore Case: " + compareValuesIgnoreCase(str1, str2));
        System.out.println("Length of str1: " + getLength(str1));
        System.out.println("Character at index " + index + ": " + getCharAt(str1, index));
        System.out.println("Uppercase: " + toUpperCase(str1));
        System.out.println("Lowercase: " + toLowerCase(str1));
        System.out.println("Replace oldVal with newVal: " + replace(str1, oldVal, newVal));
        System.out.println("Trimmed: " + trim("   Welcome   "));
        System.out.println("Contains 'come': " + contains(str1, "come"));
        System.out.println("Character Array: " + java.util.Arrays.toString(toCharArray(str1)));
        System.out.println("Is Empty: " + isEmpty(""));
        System.out.println("Ends with 'come': " + endsWith(str1, suffix));
    }
}
