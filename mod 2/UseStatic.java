class UseStatic {
    static int a = 3;  // Static variable 'a' initialized to 3
    static int b;      // Static variable 'b' declared but not initialized

    // Static method 'meth' that prints the values of its parameters and static variables
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Static block, executed once when the class is loaded
    static {
        System.out.println("Static block initialized.");
        b = a * 4;  // Initialize 'b' with the value of 'a' multiplied by 4
    }

    // Main method, the entry point of the program
    public static void main(String args[]) {
        meth(42);  // Call the static method 'meth' with the argument 42
    }
}
