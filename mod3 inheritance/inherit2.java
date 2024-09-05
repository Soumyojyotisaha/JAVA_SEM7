class A {
    public A() {
        System.out.println("This is class A");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("This is class B");
    }
}

public class inherit2 {
    public static void main(String[] args) {
        B b1 = new B();
    }
}
