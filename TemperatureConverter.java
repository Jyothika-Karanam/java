import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== TEMPERATURE CONVERTER ===");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            double input, result;

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Celsius: ");
                    input = sc.nextDouble();
                    result = (input * 9 / 5) + 32;
                    System.out.println("Fahrenheit: " + result);
                }
                case 2 -> {
                    System.out.print("Enter Celsius: ");
                    input = sc.nextDouble();
                    result = input + 273.15;
                    System.out.println("Kelvin: " + result);
                }
                case 3 -> {
                    System.out.print("Enter Fahrenheit: ");
                    input = sc.nextDouble();
                    result = (input - 32) * 5 / 9;
                    System.out.println("Celsius: " + result);
                }
                case 4 -> {
                    System.out.print("Enter Fahrenheit: ");
                    input = sc.nextDouble();
                    result = (input - 32) * 5 / 9 + 273.15;
                    System.out.println("Kelvin: " + result);
                }
                case 5 -> {
                    System.out.print("Enter Kelvin: ");
                    input = sc.nextDouble();
                    result = input - 273.15;
                    System.out.println("Celsius: " + result);
                }
                case 6 -> {
                    System.out.print("Enter Kelvin: ");
                    input = sc.nextDouble();
                    result = (input - 273.15) * 9 / 5 + 32;
                    System.out.println("Fahrenheit: " + result);
                }
                case 7 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);
    }
}
