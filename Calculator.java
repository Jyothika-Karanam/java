public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add a string and an integer (concatenation)
    public String add(String a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add two integers: " + calc.add(5, 10));
        System.out.println("Add three integers: " + calc.add(1, 2, 3));
        System.out.println("Add two doubles: " + calc.add(4.5, 3.2));
        System.out.println("Add string and integer: " + calc.add("Result is ", 100));
    }
}

