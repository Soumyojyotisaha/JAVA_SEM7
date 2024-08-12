import java.util.Scanner;
public class Time{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Prompt user for input
System.out.print("Enter number of seconds: ");
int totalSeconds = scanner.nextInt();
// Calculate hours
int hours = totalSeconds / 3600;
// Calculate remaining seconds after extracting hours
int remainingSeconds = totalSeconds % 3600;
// Calculate minutes
int minutes = remainingSeconds / 60;
// Calculate remaining seconds after extracting minutes
int seconds = remainingSeconds % 60;
// Output the result
System.out.println("Equivalent time: " + hours + "hrs, " + minutes 
+ "min, " + seconds + "secs");
scanner.close();
}
}