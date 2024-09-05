class Studentstatic {
    int rollno;
    String name;
    static String college = "VIT"; // Static variable

    // Constructor to initialize rollno and name
    Studentstatic(int r, String n) {
        rollno = r;
        name = n;
    }

    // Method to display details
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    // Main method to execute the program
    public static void main(String args[]) {
        // Create Student objects
        Studentstatic s1 = new Studentstatic(111, "Karan");
        Studentstatic s2 = new Studentstatic(222, "Aryan");

        // Display details of each student
        s1.display();
        s2.display();
    }
}
