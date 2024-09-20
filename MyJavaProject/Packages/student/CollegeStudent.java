package Packages.student;

public class CollegeStudent {
    private String name;
    private String regno;
    private int age;
    private String courseEnrolled;
    private String contactNumber;
    private String email;

    // Constructor to initialize college student details
    public CollegeStudent(String name, String regno, int age, String courseEnrolled, String contactNumber, String email) {
        this.name = name;
        this.regno = regno;
        this.age = age;
        this.courseEnrolled = courseEnrolled;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Registration Number
    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for Course Enrolled
    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    // Getter and Setter for Contact Number
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Getter and Setter for Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Registration Number: " + regno);
        System.out.println("Age: " + age);
        System.out.println("Course Enrolled: " + courseEnrolled);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
    }
}
