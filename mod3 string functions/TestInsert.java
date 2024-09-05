public class TestInsert {
    public static void main(String[] args) {
        String myStr = "Hello World";
        StringBuilder sb = new StringBuilder(myStr);
        sb.insert(5, " Java");  // Inserts " Java" at position 5
        String result = sb.toString();
        System.out.println(result);
    }
}
