public class StringAndArithmetic {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println(a + b);                // Outputs the result of arithmetic addition
        System.out.println("3" + "4");            // Outputs the result of string concatenation
        System.out.println("" + a + b);           // Outputs the result of string concatenation with integer values
        System.out.println(3 + 4 + a + " " + b + a); // Outputs the result of mixed arithmetic and string concatenation
        System.out.println("Result: " + a + b);   // Outputs the result of string concatenation with integers
        System.out.println("Result: " + (a + b)); // Outputs the result of string concatenation with the sum of integers
    }
}
