public class WordMatcher {
    public static void main(String[] args) {
        // Define the sentence
        String sentence = "Welcome to VIT";

        // Define the word to match
        String wordToMatch = "Welcome";

        // Check if the sentence contains the word
        if (sentence.contains(wordToMatch)) {
            System.out.println("The word '" + wordToMatch + "' is present in the sentence.");
        } else {
            System.out.println("The word '" + wordToMatch + "' is not present in the sentence.");
        }
    }
}
