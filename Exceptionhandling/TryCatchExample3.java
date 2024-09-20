// Example 3:
// Question: Handle an exception using the generic Exception class.

public class TryCatchExample3 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
            System.out.println("rest of the code");
        } 
        // handling the exception
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
