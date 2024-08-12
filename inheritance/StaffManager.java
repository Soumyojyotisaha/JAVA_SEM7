import java.util.*;

class Staff {
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

public class StaffManager {
public static void main(String[] args) {
Staff[] staffArray = {
new Staff("Alice", 1, 30, 25000),
new Staff("Bob", 2, 40, 15000),
new Staff("Charlie", 3, 25, 35000),
new Staff("Diana", 4, 30, 20000),
new Staff("Eve", 5, 35, 18000)
};

// a. Sort and Print the names by age
Arrays.sort(staffArray, Comparator.comparingInt(s -> s.age));
System.out.println("i. Names sorted by age (min to max):");
for (Staff s : staffArray) {
System.out.println(s.name);
}

Arrays.sort(staffArray, (s1, s2) -> Integer.compare(s2.age, s1.age));
System.out.println("ii. Names sorted by age (max to min):");
for (Staff s : staffArray) {
System.out.println(s.name);
}

// b. Display the Staff names based on their salary between 10000 and 30000
System.out.println("b. Staff names with salary between 10000 and 30000:");
for (Staff s : staffArray) {
if (s.salary >= 10000 && s.salary <= 30000) {
System.out.println(s.name);
}
}

// c. Display duplicate staff_names with their age
// Map nameCount = new HashMap<>();
// for (Staff s : staffArray) {
// nameCount.put(s.name, nameCount.getOrDefault(s.name, 0) + 1);
// }
// System.out.println("c. Duplicate staff names with age:");
// for (Staff s : staffArray) {
// if (nameCount.get(s.name) > 1) {
// System.out.println(s.name + " - " + s.age);
// }
// }

// d. Calculate the average salary of all the employees
double totalSalary = 0;
for (Staff s : staffArray) {
totalSalary += s.salary;
}
double averageSalary = totalSalary / staffArray.length;
System.out.println("d. Average salary of all employees: " + averageSalary);
}
}






