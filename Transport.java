import java.util.Scanner;

abstract class TransportMode {
    public abstract double cost(int distance);
}

class Bus extends TransportMode {
    @Override
    public double cost(int distance) {
        return distance * 3;
    }
}

class Train extends TransportMode {
    @Override
    public double cost(int distance) {
        double totalCost = distance * 2.5; // Assuming cost is 2.5 per km for Train
        if (distance > 200) {
            totalCost *= 0.9; // Applying 10% discount
        }
        return totalCost;
    }
}

class Airplane extends TransportMode {
    @Override
    public double cost(int distance) {
        double totalCost = distance * 5; // Assuming cost is 5 per km for Airplane
        if (distance >= 500 && distance <= 1000) {
            totalCost *= 0.9; // Applying 10% discount
        }
        if (distance > 2000) {
            totalCost += 5; // Adding extra 5 rps for distances above 2000 km
        }
        return totalCost;
    }
}

public class Transport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose mode of transport:");
        System.out.println("1. Bus\n2. Train\n3. Airplane");
        int choice = scanner.nextInt();

        System.out.print("Enter the distance in kilometers: ");
        int distance = scanner.nextInt();

        TransportMode transportMode;
        double finalCost = 0;

        switch (choice) {
            case 1:
                transportMode = new Bus();
                finalCost = transportMode.cost(distance);
                System.out.println("Cost for Bus: " + finalCost + " rps");
                break;
            case 2:
                transportMode = new Train();
                finalCost = transportMode.cost(distance);
                System.out.println("Cost for Train: " + finalCost + " rps");
                break;
            case 3:
                transportMode = new Airplane();
                finalCost = transportMode.cost(distance);
                System.out.println("Cost for Airplane: " + finalCost + " rps");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
