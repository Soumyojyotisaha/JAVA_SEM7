import java.util.Scanner;
public class Getdetails {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details:");
        System.out.print("Name:");
        String name=sc.nextLine();
        System.out.print("Reg No:");
        int reg=sc.nextInt();
        System.out.print("CGPA:");
        float cgpa=sc.nextFloat();
        sc.close();
        System.out.println("Name:"+name);
        System.out.println("Register No:"+reg);
        System.out.println("CGPA:"+cgpa);
    }
    
}
