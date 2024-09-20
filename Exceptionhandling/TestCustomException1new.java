// Example 3:
// Question: Create a custom exception to check the validity of an age for voting.

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}

// Class that uses custom exception InvalidAgeException
class TestCustomException1new {
    // method to check the age
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            // throw an object of user defined exception
            throw new InvalidAgeException("\n age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the age: ");
            int age = sc.nextInt();
            validate(age);
        }
        catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");
            // printing the message from InvalidAgeException object
            System.out.println("Exception occurred: " + ex);
        }
        System.out.println("rest of the code...");
    }
}
