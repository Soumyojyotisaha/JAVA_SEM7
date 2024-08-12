import java.util.Scanner;
public class Arrayelements_user {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size:");
        int n=sc.nextInt();
        int [] arr=new int [n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Array elements are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }

    }
    
}
