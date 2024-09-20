// Example 2:
// Question: Throw and catch a user-defined exception without a message.

// A Class that represents user-defined exception
class MyException extends Exception {}

// A Class that uses the above MyException
public class setText {
    // Driver Program
    public static void main(String[] args) {
        try {
            // Throw an object of user defined exception
            throw new MyException();
        }
        catch (MyException e) {
            System.out.println("Caught");
        }
    }
}
