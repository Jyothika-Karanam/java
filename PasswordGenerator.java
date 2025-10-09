import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()_+-=<>?/{}[]";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PASSWORD GENERATOR ===");
        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include numbers? (y/n): ");
        boolean includeDigits = sc.next().equalsIgnoreCase("y");

        System.out.print("Include symbols? (y/n): ");
        boolean includeSymbols = sc.next().equalsIgnoreCase("y");

        String charPool = UPPER + LOWER;
        if (includeDigits) charPool += DIGITS;
        if (includeSymbols) charPool += SYMBOLS;

        if (charPool.isEmpty()) {
            System.out.println("Error: No character types selected!");
            return;
        }

        String password = generatePassword(length, charPool);
        System.out.println("\n🔑 Generated Password: " + password);
    }

    public static String generatePassword(int length, String charPool) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            sb.append(charPool.charAt(index));
        }
        return sb.toString();
    }
}
