import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String input = sc.nextLine();

        // Convert to lowercase to handle case-insensitive comparison
        String cleanedInput = input.toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        // Check if palindrome
        if (cleanedInput.equals(reversed)) {
            System.out.println("✅ '" + input + "' is a Palindrome!");
        } else {
            System.out.println("❌ '" + input + "' is NOT a Palindrome.");
        }

        sc.close();
    }
}
