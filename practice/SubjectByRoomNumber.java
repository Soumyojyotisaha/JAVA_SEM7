import java.util.Scanner;

public class SubjectByRoomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the room number: ");
        int roomNumber = scanner.nextInt();
        scanner.close();
        switch (roomNumber) {
            case 823:
                System.out.println("Java Programming");
                break;
            case 824:
                System.out.println("Python Programming");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
