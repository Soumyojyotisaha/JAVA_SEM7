class Test {
    int a; // default access
    public int b; // public access
    private int c; // private access

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

class accessspecifier {
    public static void main(String args[]) {
        Test ob = new Test();
        ob.a = 10; // Default access; allowed within the same package
        ob.b = 20; // Public access; allowed from anywhere

        // ob.c = 100; // Error! Private member `c` cannot be accessed directly

        ob.setc(100); // OK; Private member `c` can be accessed through public method
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
