class A {
    void display() {
        System.out.println("Display method in Class A.");
    }
}

class B extends A {
    @Override
    void display() {
        System.out.println("Display method in Class B.");
    }
}

public class ExampleDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
