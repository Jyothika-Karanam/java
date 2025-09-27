import java.util.Scanner;

public class PalindromeGlowChecker {

    // ANSI escape codes for glowing effect (bright colors)
    public static final String RESET = "\u001B[0m";
    public static final String GLOW_GREEN = "\u001B[92m";
    public static final String GLOW_RED = "\u001B[91m";
    public static final String GLOW_YELLOW = "\u001B[93m";

    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void glowResult(String input, boolean isPalin) {
        System.out.println(GLOW_YELLOW + "Checking: \"" + input + "\"" + RESET);
        if (isPalin) {
            System.out.println(GLOW_GREEN + "✨ It's a glowing palindrome! ✨" + RESET);
        } else {
            System.out.println(GLOW_RED + "❌ Not a palindrome. Try again!" + RESET);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(GLOW_YELLOW + "Enter a string to check: " + RESET);
        String userInput = scanner.nextLine();

        boolean result = isPalindrome(userInput);
        glowResult(userInput, result);
    }
}