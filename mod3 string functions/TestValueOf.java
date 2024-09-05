public class TestValueOf {
    public static void main(String[] args) {
        char[] myArray = {'a', 'b', 'c'};
        System.out.println(String.valueOf(myArray));  // "abc"
        System.out.println(String.valueOf(123));      // "123"
        System.out.println(String.valueOf(45.67));    // "45.67"
    }
}
