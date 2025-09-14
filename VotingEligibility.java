import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("Sorry, you are not eligible to vote yet.");
        }

        scanner.close();
    }
}