import java.util.Scanner;
class Factorial_user{  
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of the number:");  
    int number=sc.nextInt(); 
    sc.close();
    int fact=1;  
    //It is the number to calculate factorial    
     for(int i=1;i<=number;i++){    
         fact=fact*i;    
     }    
     System.out.println("Factorial of "+number+" is: "+fact);    
    }  
   }  