//Template for Class with main Function

// public class MyClass {
//     public void display()
//     {
//         System.out.println("Welcome to VIT come to SJT");
//     }
//     public static void main(String[] args)
//     {
//         MyClass obj=new MyClass();
//         obj.display();
//     }
// }

//Template for Class with Constructor and Object

// public class MyClass {
//     public MyClass()
//     {
//         System.out.println("Welcome to VIT come to SJT");
//     }
//     public void display()
//     {
//         System.out.println("Welcome to VIT come to SJT");
//     }
//     public static void main(String[] args)
//     {
//         MyClass obj=new MyClass();
//         obj.display();
//     }
    
// }

//String Operations with One Line Example

// public class MyClass
// {
//     public static void main(String[] args)
//     {
//         String str="Welcome to VIT come to SJT";
//         System.out.println("length of string:"+str.length());
//     }
// }

//Scanner Class and Its Functions

import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine(); // Reading a string
        System.out.println("You entered: " + input);
        scanner.close();
    }
}
