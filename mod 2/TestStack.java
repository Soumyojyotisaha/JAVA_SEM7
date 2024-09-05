// Stack.java
class Stack {
    private int stck[] = new int[10]; // Private array to store stack elements
    private int tos; // Private index to track the top of the stack

    // Constructor to initialize the stack
    Stack() {
        tos = -1; // Initialize stack as empty
    }

    // Method to push an item onto the stack
    void push(int item) {
        if (tos == 9) // Check if the stack is full
            System.out.println("Stack is full.");
        else
            stck[++tos] = item; // Push item onto the stack
    }

    // Method to pop an item from the stack
    int pop() {
        if (tos < 0) { // Check if the stack is empty
            System.out.println("Stack underflow.");
            return 0; // Return a default value
        } else
            return stck[tos--]; // Pop item from the stack
    }
}

// TestStack.java
class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack(); // Create two stack objects
        Stack mystack2 = new Stack();

        // Push numbers onto the first stack
        for (int i = 0; i < 10; i++)
            mystack1.push(i);

        // Push numbers onto the second stack
        for (int i = 10; i < 20; i++)
            mystack2.push(i);

        // Pop numbers from the first stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        // Pop numbers from the second stack
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

        // Uncommenting the following lines would cause errors
        // mystack1.tos = -2; // Error: tos has private access
        // mystack2.stck[3] = 100; // Error: stck has private access
    }
}
