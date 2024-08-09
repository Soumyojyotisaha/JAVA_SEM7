public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Soumyojyoti";
        String str2 = "soumyojyoti";

        boolean isEqual = compareStringsIgnoreCase(str1, str2);
        System.out.println("Strings are equal (ignoring case): " + isEqual);
    }

    public static boolean compareStringsIgnoreCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
}
