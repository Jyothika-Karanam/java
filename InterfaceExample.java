// Define an interface
interface Shape {
    double area();
    double perimeter();
}

// Implementing the Shape interface in Circle class
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement area method
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implement perimeter method
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Implementing the Shape interface in Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement area method
    public double area() {
        return length * width;
    }

    // Implement perimeter method
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Main class to test the interface
public class InterfaceExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
}
