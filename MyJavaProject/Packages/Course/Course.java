package Packages.Course;

public class Course {
    private String courseName;
    private String courseCode;
    private String courseDescription;
    private int credits;
    private String instructorName;

    // Constructor to initialize course details
    public Course(String courseName, String courseCode, String courseDescription, int credits, String instructorName) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        this.credits = credits;
        this.instructorName = instructorName;
    }

    // Getter and Setter for Course Name
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getter and Setter for Course Code
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    // Getter and Setter for Course Description
    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    // Getter and Setter for Credits
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Getter and Setter for Instructor Name
    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Description: " + courseDescription);
        System.out.println("Credits: " + credits);
        System.out.println("Instructor Name: " + instructorName);
    }
}
