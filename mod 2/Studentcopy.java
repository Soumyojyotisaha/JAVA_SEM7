class Studentcopy {
    int id;
    String name;

    // Constructor to initialize id and name
    Studentcopy(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor to initialize with another Student object
    Studentcopy(Studentcopy s) {
        id = s.id;
        name = s.name;
    }

    // Method to display student details
    void display() {
        System.out.println(id + " " + name);
    }

    // Main method
    public static void main(String args[]) {
        // Creating a Student object with ID and name
        Studentcopy s1 = new Studentcopy(111, "Karan");

        // Creating another Student object by copying s1
        Studentcopy s2 = new Studentcopy(s1);

        // Displaying details of both Student objects
        s1.display(); // Output: 111 Karan
        s2.display(); // Output: 111 Karan
    }
}
