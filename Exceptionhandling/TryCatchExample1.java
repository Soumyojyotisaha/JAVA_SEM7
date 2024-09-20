// Example 1:
// Question: Handle an arithmetic exception where a division by zero occurs.


public class TryCatchExample1 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
        } 
        // handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
