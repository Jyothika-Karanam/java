import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🔐 Enter your password to check its strength:");
        String password = scanner.nextLine();

        int score = 0;

        // Length check
        if (password.length() >= 8) score++;
        else System.out.println("❌ Password should be at least 8 characters long.");

        // Uppercase check
        if (password.matches(".*[A-Z].*")) score++;
        else System.out.println("❌ Add at least one uppercase letter.");

        // Lowercase check
        if (password.matches(".*[a-z].*")) score++;
        else System.out.println("❌ Add at least one lowercase letter.");

        // Digit check
        if (password.matches(".*\\d.*")) score++;
        else System.out.println("❌ Add at least one digit.");

        // Special character check
        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) score++;
        else System.out.println("❌ Add at least one special character.");

        // Final verdict
        System.out.println("\n🔎 Password Strength:");
        switch (score) {
            case 5 -> System.out.println("✅ Excellent! Your password is strong.");
            case 4 -> System.out.println("👍 Good. Just a few tweaks needed.");
            case 3 -> System.out.println("⚠️ Fair. Consider improving it.");
            default -> System.out.println("🚫 Weak. You should change your password.");
        }

        scanner.close();
    }
}