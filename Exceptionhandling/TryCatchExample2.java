// Example 2:
// Question: Demonstrate that code after an exception-causing statement won't be executed within the try block.

public class TryCatchExample2 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
            System.out.println("rest of the code");
        }
        // handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
