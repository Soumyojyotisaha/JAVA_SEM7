// Superclass A
class A {
    // Non-parameterized constructor
    A() {
        System.out.println("This is the non-parameterized constructor of class A");
    }

    // Parameterized constructor
    A(String message) {
        System.out.println("This is the parameterized constructor of class A: " + message);
    }
}

// Subclass B extends A
class B extends A {
    // Non-parameterized constructor
    B() {
        // Calls the non-parameterized constructor of class A
        super(); 
        System.out.println("This is the non-parameterized constructor of class B");
    }

    // Parameterized constructor
    B(String message) {
        // Calls the parameterized constructor of class A
        super(message); 
        System.out.println("This is the parameterized constructor of class B: " + message);
    }
}

// Main class to run the code
public class inherit1 {
    public static void main(String args[]) {
        // Creating an object of class B using the non-parameterized constructor
        System.out.println("Creating b1:");
        B b1 = new B();

        // Creating an object of class B using the parameterized constructor
        System.out.println("\nCreating b2:");
        B b2 = new B("Hello from B");
    }
}
