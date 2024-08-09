public class PalindromeChecker {
    
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Using StringBuilder to reverse the string
        StringBuilder rev = new StringBuilder(str).reverse();
        
        // Check if the reversed string is equal to the original string
        return str.equals(rev.toString());
    }

    public static void main(String[] args) {
        // Input string
        String str = "madam";

        // Convert the string to lowercase
        str = str.toLowerCase();

        // Check if the string is a palindrome
        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome);
    }
}
