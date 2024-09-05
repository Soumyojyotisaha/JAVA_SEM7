class Student {
    int id;       // Field to store the student's id
    String name;  // Field to store the student's name
}

class TestStudent1 {
    public static void main(String args[]) {
        // Creating an object of Student class
        Student s1 = new Student();
        
        // Accessing and printing default values of the fields
        System.out.println(s1.id);    // Prints default int value (0)
        System.out.println(s1.name);  // Prints default String value (null)
    }
}
