import java.util.Scanner;

class Parcel {
    String deliveryTime;
    String deliveryPlace;
    String pickupTime;
    String pickupPlace;

    // Constructor
    public Parcel(String deliveryTime, String deliveryPlace, String pickupTime, String pickupPlace) {
        this.deliveryTime = deliveryTime;
        this.deliveryPlace = deliveryPlace;
        this.pickupTime = pickupTime;
        this.pickupPlace = pickupPlace;
    }

    // Display parcel details
    public void displayDetails() {
        System.out.println("Delivery Time: " + deliveryTime);
        System.out.println("Delivery Place: " + deliveryPlace);
        System.out.println("Pickup Time: " + pickupTime);
        System.out.println("Pickup Place: " + pickupPlace);
    }
}

public class AmazonParcelSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get delivery details from the user
        System.out.print("Enter delivery time: ");
        String deliveryTime = scanner.nextLine();
        System.out.print("Enter delivery place: ");
        String deliveryPlace = scanner.nextLine();
        
        // Get pickup details from the user
        System.out.print("Enter pickup time: ");
        String pickupTime = scanner.nextLine();
        System.out.print("Enter pickup place: ");
        String pickupPlace = scanner.nextLine();

        // Create a Parcel object
        Parcel parcel = new Parcel(deliveryTime, deliveryPlace, pickupTime, pickupPlace);

        // Display parcel details
        System.out.println("\nParcel Details:");
        parcel.displayDetails();

        scanner.close();
    }
}
