// Superclass
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Subclass 1
class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); // Call superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    void displayCarInfo() {
        displayInfo(); // Call method from superclass
        System.out.println("Doors: " + numberOfDoors);
    }
}

// Subclass 2
class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    void displayBikeInfo() {
        displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 180, 4);
        Bike myBike = new Bike("Yamaha", 120, true);

        System.out.println("Car Info:");
        myCar.displayCarInfo();

        System.out.println("\nBike Info:");
        myBike.displayBikeInfo();
    }
}