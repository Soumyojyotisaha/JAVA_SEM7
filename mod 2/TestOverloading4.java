class TestOverloading4 {
    // Main method with String[] args
    public static void main(String[] args) {
        System.out.println("main with String[]");
    }

    // Overloaded main method with String args
    public static void main(String args) {
        System.out.println("main with String");
    }

    // Overloaded main method with no arguments
    public static void main() {
        System.out.println("main without args");
    }
}
