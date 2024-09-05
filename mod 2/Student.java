class Student {
    int id;    // Field to store the student's ID
    String name; // Field to store the student's name
    int age;   // Field to store the student's age

    // Constructor with two parameters
    Student(int i, String n) {
        id = i;
        name = n;
        age = 0; // Default value for age if not provided
    }

    // Constructor with three parameters
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    // Method to display student details
    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    // Main method
    public static void main(String args[]) {
        Student s1 = new Student(111, "Karan"); // Create a Student object with ID and name
        Student s2 = new Student(222, "Aryan", 25); // Create a Student object with ID, name, and age
        
        s1.display(); // Display details of the first student
        s2.display(); // Display details of the second student
    }
}
