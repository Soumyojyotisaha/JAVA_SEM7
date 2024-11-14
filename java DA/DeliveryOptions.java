import java.util.Scanner;

public class DeliveryOptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Delivery Partner:");
        System.out.println("1. Amazon");
        System.out.println("2. Flipkart");
        System.out.println("3. Other");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Amazon Delivery:");
                System.out.println("Location: Delhi");
                System.out.println("Delivery Time: 2 Days");
                break;
            case 2:
                System.out.println("Flipkart Delivery:");
                System.out.println("Location: Mumbai");
                System.out.println("Delivery Time: 3 Days");
                break;
            case 3:
                System.out.println("Other Delivery:");
                System.out.println("Location: Bangalore");
                System.out.println("Delivery Time: 5 Days");
                break;
            default:
                System.out.println("Invalid Option.");
        }
        sc.close();
    }
}
