import java.util.Scanner;

// Abstract class
abstract class Transport {
    double distance;
    String routeName;

    Transport(double distance, String routeName) {
        this.distance = distance;
        this.routeName = routeName;
    }

    abstract double fare();
    abstract double travelTime();

    void showRouteInfo() {
        System.out.println("\nRoute Name : " + routeName);
        System.out.println("Distance   : " + distance + " km");
    }
}

// Bus subclass
class Bus extends Transport {

    Bus(double distance, String routeName) {
        super(distance, routeName);
    }

    @Override
    double fare() {
        double ratePerKm = 2.5;
        double minFare = 10;
        return Math.max(distance * ratePerKm, minFare);
    }

    @Override
    double travelTime() {
        double avgSpeed = 40; // km per hour
        return distance / avgSpeed;
    }
}

// Metro subclass
class Metro extends Transport {

    Metro(double distance, String routeName) {
        super(distance, routeName);
    }

    @Override
    double fare() {
        double ratePerKm = 4;
        double baseFare = 15;
        return baseFare + (distance * ratePerKm);
    }

    @Override
    double travelTime() {
        double avgSpeed = 70; // km per hour
        return distance / avgSpeed;
    }
}

// Main class
public class TransportDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Route Name: ");
        String route = sc.nextLine();

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        // Runtime polymorphism
        Transport t1 = new Bus(distance, route);
        Transport t2 = new Metro(distance, route);

        System.out.println("\n===== Bus Details =====");
        t1.showRouteInfo();
        System.out.println("Fare          : " + t1.fare());
        System.out.println("Travel Time   : " + t1.travelTime() + " hours");

        System.out.println("\n===== Metro Details =====");
        t2.showRouteInfo();
        System.out.println("Fare          : " + t2.fare());
        System.out.println("Travel Time   : " + t2.travelTime() + " hours");

        sc.close();
    }
}
