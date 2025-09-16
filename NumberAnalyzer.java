import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎯 Welcome to Jyothika's Number Analyzer 🎯");
        System.out.print("How many numbers would you like to enter? ");
        int count = scanner.nextInt();

        double[] numbers = new double[count];
        double sum = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / count;

        System.out.println("\n📊 Analysis Complete!");
        System.out.println("🔢 Total Numbers: " + count);
        System.out.println("➕ Sum: " + sum);
        System.out.println("📈 Average: " + average);

        System.out.println("\n✨ Fun Feedback ✨");
        if (average > 100) {
            System.out.println("💥 Whoa! That’s a high average. You’re on fire!");
        } else if (average > 50) {
            System.out.println("🔥 Nice! Solid numbers with great balance.");
        } else {
            System.out.println("🌱 Humble beginnings—perfect for growing something big!");
        }

        scanner.close();
    }
}