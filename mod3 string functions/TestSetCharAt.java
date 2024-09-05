public class TestSetCharAt {
    public static void main(String[] args) {
        String myStr = "Hello World";
        StringBuilder sb = new StringBuilder(myStr);
        sb.setCharAt(6, 'w');  // Changes "World" to "wOrld"
        String result = sb.toString();
        System.out.println(result);
    }
}
