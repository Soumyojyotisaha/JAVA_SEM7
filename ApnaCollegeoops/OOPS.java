// Pen and Student Classes
class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    static String school; // Static variable for all students

    // Default constructor
    Student() {
        System.out.println("Default constructor called");
    }

    // Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void print(String name) {
        System.out.println(name);
    }

    public void print(int age) {
        System.out.println(age);
    }

    public void print(String name, int age) {
        System.out.println(name + " " + age);
    }

    public static void changeSchool(String newSchool) {
        school = newSchool;
    }
}

// Shape, Triangle, and Circle Classes
class Shape {
    String color; // Adding color attribute to the base Shape class

    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

// Abstract Animal Class
abstract class Animal {
    abstract void walk();  // Abstract method to be implemented by subclasses

    public void eats() {
        System.out.println("Eats to survive");
    }

    Animal() {
        System.out.println("You are creating a new animal");
    }
}

// Horse and Chicken Classes
class Horse extends Animal {
    Horse() {
        System.out.println("Created a Horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

// Interfaces Example
interface AnimalInterface {
    int eyes = 2; // By default, public, static, and final
    void walk();  // By default, public and abstract
}

interface Herbivore { }

class InterfaceHorse implements AnimalInterface, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs (from InterfaceHorse)");
    }
}

// Main Class
public class OOPS {
    public static void main(String[] args) {
        // Pen and Student usage
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "soumyo";
        s1.age = 24;

        s1.print(s1.name, s1.age);

        // Shape usage
        Triangle t1 = new Triangle();
        t1.color = "red"; // Now color is available in Shape
        System.out.println("Triangle color: " + t1.color);
        t1.area(10, 5); // Displays the area of the triangle

        Circle c1 = new Circle();
        c1.color = "blue";
        System.out.println("Circle color: " + c1.color);
        c1.area(7); // Displays the area of the circle

        // Animal example with Horse
        Horse horse = new Horse();
        horse.walk();
        horse.eats();

        // Interface example with InterfaceHorse
        InterfaceHorse ihorse = new InterfaceHorse();
        ihorse.walk();

        // Static method example
        Student.changeSchool("HCS");
        Student student1 = new Student();
        student1.name = "Tony";
        System.out.println(student1.school); // Output: HCS
    }
}
