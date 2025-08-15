// Define the Car class
class Car {
    // Properties (fields)
    String brand;
    String color;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("----------------------");
    }
}

// Main class to run the program
public class Mainc {
    public static void main(String[] args) {
        // Create first Car object
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "Red";
        car1.year = 2020;

        // Create second Car object
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.color = "Blue";
        car2.year = 2022;

        // Display details of both cars
        car1.displayDetails();
        car2.displayDetails();
    }
}