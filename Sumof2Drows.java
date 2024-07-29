import java.util.Scanner;
public class Sumof2Drows {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2D Array size:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int [n][m];
        System.out.println("Enter 2D array elements:");
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Two dimensional array row wise sum is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum=sum+arr[i][j];
            }
            System.out.println("The sum is:"+sum);
            sum=0;
        }
    }
}
