import Packages.student.CollegeStudent;
import Packages.Course.Course;

public class Test {
    public static void main(String[] args) {
        // Create a CollegeStudent with more information
        CollegeStudent collegeStudent = new CollegeStudent("Soumyojyoti Saha", "21BCE4007", 21, "B.Tech in CSE", "7001813062", "soumyojyoti.saha2021@vitstudent.ac.in");

        // Create a course
        Course course = new Course("JAVA", "BCSE206", "Introduction to Java Programming", 3, "Dr. Sathyaraj");

        // Display college student details
        System.out.println("\nCollegeStudent Details:");
        collegeStudent.displayStudentDetails();

        // Display course details
        System.out.println("\nCourse Details:");
        course.displayCourseDetails();
    }
}
