public class TestSetLength {
    public static void main(String[] args) {
        String myStr = "Hello World";
        StringBuilder sb = new StringBuilder(myStr);
        sb.setLength(5);  // Truncates to "Hello"
        String result = sb.toString();
        System.out.println(result);

        sb = new StringBuilder(myStr);
        sb.setLength(9);  // Pads to "Hello World" (no visible change in this case)
        result = sb.toString();
        System.out.println(result);
    }
}
