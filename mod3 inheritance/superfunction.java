// Superclass A
class A {
    int num = 100;

    // Superclass non-parameterized constructor
    A() {
        System.out.println("This is the non-parameterized constructor of class A");
    }

    // Superclass parameterized constructor
    A(int num) {
        this.num = num;
        System.out.println("Parameterized constructor of class A: num = " + this.num);
    }

    // Superclass method
    void display() {
        System.out.println("Method of class A: num = " + num);
    }
}

// Subclass B extends A
class B extends A {
    int num = 200;

    // Subclass non-parameterized constructor
    B() {
        // Calling superclass non-parameterized constructor
        super();
        System.out.println("This is the non-parameterized constructor of class B");
    }

    // Subclass parameterized constructor
    B(int num) {
        // Calling superclass parameterized constructor
        super(num); 
        System.out.println("This is the parameterized constructor of class B: num = " + this.num);
    }

    // Subclass method overriding superclass method
    void display() {
        System.out.println("Method of class B: num = " + num);
        
        // Referring to superclass method
        super.display();

        // Referring to superclass instance variable
        System.out.println("Superclass instance variable num = " + super.num);
    }
}

// Main class to run the code
public class superfunction {
    public static void main(String args[]) {
        // Creating an object of class B using non-parameterized constructor
        System.out.println("Creating b1:");
        B b1 = new B();
        
        // Call the display method of class B
        b1.display();

        // Creating an object of class B using parameterized constructor
        System.out.println("\nCreating b2:");
        B b2 = new B(300);

        // Call the display method of class B
        b2.display();
    }
}
