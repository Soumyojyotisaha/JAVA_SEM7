import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String regno;
    int age;

    Student(String name, String regno, int age) {
        this.name = name;
        this.regno = regno;
        this.age = age;
    }
}

public class StudentArray {
    public static void main(String[] args) {
        // Create an array of Students with a minimum of 5 entries
        Student[] students = {
            new Student("Raj", "21BCE4001", 20),
            new Student("Reema", "21BCE4002", 22),
            new Student("Soham", "21BCE4003", 19),
            new Student("Arun", "21BCE4004", 23),
            new Student("Rohan", "21BCE4005", 21),
            new Student("Esha", "21BCE4006", 20),
            new Student("Rima", "21BCE4007", 22)
        };

        // a.i. Sort and print names by minimum to maximum length
        System.out.println("Names sorted by length (min to max):");
        Arrays.stream(students)
                .sorted(Comparator.comparingInt(s -> s.name.length()))
                .forEach(s -> System.out.println(s.name));
        
        // a.ii. Sort and print names by maximum to minimum length
        System.out.println("\nNames sorted by length (max to min):");
        Arrays.stream(students)
                .sorted((s1, s2) -> Integer.compare(s2.name.length(), s1.name.length()))
                .forEach(s -> System.out.println(s.name));
        
        // b. Display student names that contain "R" at the first position or "E" at the end
        System.out.println("\nStudent names that contain 'R' at first or 'E' at the end:");
        Arrays.stream(students)
                .filter(s -> s.name.startsWith("R") || s.name.endsWith("E"))
                .forEach(s -> System.out.println(s.name));
        
        // c. Display duplicate student names with their register numbers
        System.out.println("\nDuplicate student names with their register numbers:");
        Map<String, List<Student>> nameMap = Arrays.stream(students)
                .collect(Collectors.groupingBy(s -> s.name));
        nameMap.values().stream()
                .filter(list -> list.size() > 1)
                .forEach(list -> list.forEach(s -> System.out.println(s.name + " - " + s.regno)));
        
        // d. Display register numbers of students whose age is between 19 and 23
        System.out.println("\nRegister numbers of students with age between 19 and 23:");
        Arrays.stream(students)
                .filter(s -> s.age >= 19 && s.age <= 23)
                .forEach(s -> System.out.println(s.regno));
    }
}
