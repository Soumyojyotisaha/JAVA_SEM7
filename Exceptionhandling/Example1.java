// Example 5:
// Question: Create and throw a custom exception with a string message.

class MyException extends Exception {
    String str1;
    // Constructor of custom exception class
    MyException(String str2) {
        str1 = str2;
    }

    public String toString() {
        return ("MyException Occurred: " + str1);
    }
}

class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println("Starting of try block");
            // Throw the custom exception
            throw new MyException("This is My error Message");
        }
        catch (MyException exp) {
            System.out.println("Catch Block");
            System.out.println(exp);
        }
    }
}
