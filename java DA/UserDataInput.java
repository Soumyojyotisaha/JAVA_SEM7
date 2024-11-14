import java.util.Scanner;

public class UserDataInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your registration number: ");
        int regNo = sc.nextInt();
        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();
        
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regNo);
        System.out.println("CGPA: " + cgpa);
    }
}
