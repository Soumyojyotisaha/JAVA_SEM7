class A {
    private int a;
    
    A(int a) {
        this.a = a;
        System.out.println("This is constructor of class A with value " + a);
    }
}

class B extends A {
    private int b;
    private double c;
    
    B(int a, int b, double c) {
        super(a);  // Call superclass constructor with an int parameter
        this.b = b;
        this.c = c;
        System.out.println("This is constructor of class B");
    }
}

public class inhtest2 {
    public static void main(String[] args) {
        B b1 = new B(5, 10, 20.5);  // Create an instance of class B with appropriate values
    }
}
