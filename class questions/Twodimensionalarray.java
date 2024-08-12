import java.util.Scanner;
class Twodimensionalarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2D Array size:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int [n][m];
        System.out.println("Enter 2D array elements:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Two dimensional array elements are:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
