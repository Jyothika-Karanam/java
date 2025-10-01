import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== SIMPLE CALCULATOR ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1 -> System.out.println("Result: " + (num1 + num2));
                    case 2 -> System.out.println("Result: " + (num1 - num2));
                    case 3 -> System.out.println("Result: " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0)
                            System.out.println("Result: " + (num1 / num2));
                        else
                            System.out.println("Error: Division by zero!");
                    }
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice, try again.");
            }

        } while (choice != 5);

        System.out.println("Goodbye!");
    }
}
