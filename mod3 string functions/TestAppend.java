public class TestAppend {
    public static void main(String[] args) {
        String myStr = "Soumyojyoti";
        String result = new StringBuilder(myStr).append(" Saha").toString();  // Returns "Hello World"
        System.out.println(result);
    }
}
