public class ReplaceSubstring {
    public static void main(String[] args) {
        String str = "He is good person and he is an active person.";
        String replacedStr = str.replaceAll("person", "boy");
        System.out.println("Modified string: " + replacedStr);
    }
}
