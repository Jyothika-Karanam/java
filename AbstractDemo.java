// Abstract class
abstract class Shape {
    // Abstract method
    abstract double getArea();
}

// Concrete subclass 1
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    // Implementing abstract method
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass 2
class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Implementing abstract method
    double getArea() {
        return length * width;
    }
}

// Main class
public class AbstractDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}