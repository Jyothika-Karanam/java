import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloJyothika {
    public static void main(String[] args) {
        // Your name and mood
        String name = "Jyothika";
        String mood = "creative and unstoppable";

        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");

        // Display greeting
        System.out.println("🌸 Hello, " + name + "!");
        System.out.println("You're feeling " + mood + " today.");
        System.out.println("Current date and time: " + now.format(formatter));
        System.out.println("Keep shining and coding with style 💻✨");
    }
}