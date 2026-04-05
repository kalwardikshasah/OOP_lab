import java.util.Scanner;

class Vehicle {
    String brand;
    String model;
    double rental_price;

    void display_Info() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: ₹" + rental_price);
    }
}

class Car extends Vehicle {
    String fuel_type;

    void display_Info() {
        super.display_Info();
        System.out.println("Fuel Type: " + fuel_type);
    }
}

class Bike extends Vehicle {
    String engine_capacity;

    void display_Info() {
        super.display_Info();
        System.out.println("Engine Capacity: " + engine_capacity);
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (Car/Bike): ");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase("Car")) {
            Car car = new Car();
            System.out.print("Enter brand: ");
            car.brand = sc.nextLine();
            System.out.print("Enter model: ");
            car.model = sc.nextLine();
            System.out.print("Enter rental price: ");
            car.rental_price = sc.nextDouble();
            sc.nextLine(); // consume newline
            System.out.print("Enter fuel type: ");
            car.fuel_type = sc.nextLine();

            System.out.println("\nVehicle Details:");
            car.display_Info();

        } else if (type.equalsIgnoreCase("Bike")) {
            Bike bike = new Bike();
            System.out.print("Enter brand: ");
            bike.brand = sc.nextLine();
            System.out.print("Enter model: ");
            bike.model = sc.nextLine();
            System.out.print("Enter rental price: ");
            bike.rental_price = sc.nextDouble();
            sc.nextLine(); // consume newline
            System.out.print("Enter engine capacity: ");
            bike.engine_capacity = sc.nextLine();

            System.out.println("\nVehicle Details:");
            bike.display_Info();

        } else {
            System.out.println("Invalid vehicle type entered.");
        }

        sc.close();
    }
}
