import java.util.Scanner;
public class Greatestof3_user {
    public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of a,b,c respectively");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b && a>c)
    {
        System.out.println("A is greatest");
    }
    else if (b>a && b>c)
    {
        System.out.println("B is greatest");
    }
    else
    {
        System.out.println("C is greatest");
    }
   } 
}