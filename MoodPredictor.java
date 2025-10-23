import java.util.Random;
import java.util.Scanner;

public class MoodPredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moods = {
            "😊 Happy - A perfect day to smile and spread positivity!",
            "😎 Confident - You’re ready to conquer the world today!",
            "🤔 Thoughtful - Deep thinking brings great ideas!",
            "😴 Lazy - Chill mode on. Take it easy today!",
            "😁 Excited - Good vibes are coming your way!",
            "😌 Calm - Enjoy the peace and balance around you.",
            "😜 Playful - Time for some fun and laughter!"
        };

        String[] colors = {
            "Blue 💙", "Red ❤️", "Green 💚", "Yellow 💛", "Purple 💜", "Orange 🧡", "Pink 💖"
        };

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Random random = new Random();
        int moodIndex = random.nextInt(moods.length);
        int colorIndex = random.nextInt(colors.length);

        System.out.println("\n✨ Hello, " + name + "! ✨");
        System.out.println("Your lucky color today is: " + colors[colorIndex]);
        System.out.println("Your predicted mood: " + moods[moodIndex]);
        System.out.println("\n🌟 Have a wonderful day! 🌟");
        
        sc.close();
    }
}
