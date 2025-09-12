import java.util.Scanner;

public class FactorialDemo {

    // Recursive method
    public static long factorialRecursive(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorialRecursive(n - 1);
    }

    // Iterative method
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        System.out.println("Using Recursion: " + number + "! = " + factorialRecursive(number));
        System.out.println("Using Iteration: " + number + "! = " + factorialIterative(number));

        scanner.close();
    }
}