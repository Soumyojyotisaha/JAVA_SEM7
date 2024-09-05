public class TestCompareToIgnoreCase {
    public static void main(String[] args) {
        String myStr1 = "HELLO";
        String myStr2 = "hello";
        System.out.println(myStr1.compareToIgnoreCase(myStr2));  // Returns 0
    }
}
