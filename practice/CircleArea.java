import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.close();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The value of pie is "+ Math.PI);
    }
}