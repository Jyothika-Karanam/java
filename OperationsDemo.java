public class OperationsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operations
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operations
        System.out.println("\nRelational Operations:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operations
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operations:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operations
        System.out.println("\nBitwise Operations:");
        System.out.println("a & b: " + (a & b));   // AND
        System.out.println("a | b: " + (a | b));   // OR
        System.out.println("a ^ b: " + (a ^ b));   // XOR
        System.out.println("~a: " + (~a));         // NOT
        System.out.println("a << 1: " + (a << 1)); // Left shift
        System.out.println("a >> 1: " + (a >> 1)); // Right shift
    }
}