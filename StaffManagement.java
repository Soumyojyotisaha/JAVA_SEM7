import java.util.*;

public class StaffManagement {

    // Define the Staff class to hold staff details
    static class Staff {
        String name;
        int id;
        int age;
        double salary;

        Staff(String name, int id, int age, double salary) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        // Create an array of Staff objects
        Staff[] staffArray = {
            new Staff("Alice", 1, 30, 25000),
            new Staff("Bob", 2, 45, 15000),
            new Staff("Charlie", 3, 30, 28000),
            new Staff("David", 4, 35, 32000),
            new Staff("Alice", 5, 30, 26000) // Duplicate name for testing
        };

        // a. Sort and Print the names by age
        System.out.println("Staff names sorted by age (minimum to maximum length):");
        Arrays.stream(staffArray)
            .sorted(Comparator.comparingInt(staff -> staff.age))
            .forEach(staff -> System.out.println(staff.name));

        System.out.println("\nStaff names sorted by age (maximum to minimum length):");
        Arrays.stream(staffArray)
            .sorted((s1, s2) -> Integer.compare(s2.age, s1.age))
            .forEach(staff -> System.out.println(staff.name));

        // b. Display the Staff names based on their salary between 10000 and 30000
        System.out.println("\nStaff names with salary between 10000 and 30000:");
        Arrays.stream(staffArray)
            .filter(staff -> staff.salary >= 10000 && staff.salary <= 30000)
            .forEach(staff -> System.out.println(staff.name));

        // c. Display the duplicate staff names with their age
        System.out.println("\nDuplicate staff names with their age:");
        Map<String, List<Integer>> nameToAges = new HashMap<>();
        for (Staff staff : staffArray) {
            nameToAges.computeIfAbsent(staff.name, k -> new ArrayList<>()).add(staff.age);
        }
        nameToAges.entrySet().stream()
            .filter(entry -> entry.getValue().size() > 1)
            .forEach(entry -> {
                System.out.println("Name: " + entry.getKey() + " Ages: " + entry.getValue());
            });

        // d. Calculate the average salary of all the employees
        double averageSalary = Arrays.stream(staffArray)
            .mapToDouble(staff -> staff.salary)
            .average()
            .orElse(0.0);
        System.out.println("\nAverage salary of all employees: " + averageSalary);
    }
}
