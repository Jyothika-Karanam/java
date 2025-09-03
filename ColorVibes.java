import java.util.Scanner;

public class ColorVibes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("🎤 What's your name? ");
        String name = scanner.nextLine();

        // Ask for favorite color
        System.out.print("🎨 What's your favorite color? ");
        String color = scanner.nextLine();

        // Respond with a playful message
        System.out.println("✨ Hello " + name + "! Your vibe today is totally " + color + "—bold, bright, and unforgettable!");
        System.out.println("💡 Fun tip: You can use your favorite color in HTML with CSS like this:");
        System.out.println("   body { background-color: " + color.toLowerCase() + "; }");

        scanner.close();
    }
}