import java.util.*;

public class MoodPredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        // Greeting
        System.out.println("✨ Welcome to the Mood Predictor ✨");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Random mood list
        String[] moods = {
            "Super energetic 💪",
            "Calm and peaceful 🌸",
            "Creative and inspired 🎨",
            "Adventurous 🌍",
            "Lazy but happy 😴",
            "Romantic 💖",
            "Focused and determined 🎯",
            "Playful 😜",
            "Dreamy ☁️",
            "Mysterious 🔮"
        };

        // Randomly select a mood
        int moodIndex = rand.nextInt(moods.length);
        String todaysMood = moods[moodIndex];

        // Display result
        System.out.println("\n🌞 Hey " + name + "!");
        System.out.println("Your mood for today is: " + todaysMood);
        System.out.println("\n💫 Have a wonderful day ahead! 💫");
    }
}
