public class CaseConversion {
    public static void main(String[] args) {
        String str = "Soumyojyoti Saha";

        String upperCaseString = toUpperCase(str);
        String lowerCaseString = toLowerCase(str);

        System.out.println("Uppercase: " + upperCaseString);
        System.out.println("Lowercase: " + lowerCaseString);
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
