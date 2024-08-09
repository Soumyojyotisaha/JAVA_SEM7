public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello World";
        char character = 'o';
        int count = countCharacterOccurrences(str, character);
        System.out.println("Total occurrences of '" + character + "': " + count);
    }

    public static int countCharacterOccurrences(String str, char character) {
        return str.length() - str.replace(String.valueOf(character), "").length();
    }
}
