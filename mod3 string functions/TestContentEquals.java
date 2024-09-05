public class TestContentEquals {
    public static void main(String[] args) {
        String myStr = "Hello";
        System.out.println(myStr.contentEquals("Hello"));  // true
        System.out.println(myStr.contentEquals("Hel"));    // false
    }
}
