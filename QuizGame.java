import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "1. What is the capital of France?",
            "2. Which programming language is used for Android development?",
            "3. What is 5 + 7?",
            "4. Who is known as the Father of Computers?",
            "5. Which planet is known as the Red Planet?"
        };

        String[][] options = {
            {"A. Paris", "B. London", "C. Berlin", "D. Rome"},
            {"A. Python", "B. Java", "C. C++", "D. Swift"},
            {"A. 10", "B. 11", "C. 12", "D. 13"},
            {"A. Isaac Newton", "B. Charles Babbage", "C. Alan Turing", "D. Albert Einstein"},
            {"A. Earth", "B. Venus", "C. Mars", "D. Jupiter"}
        };

        char[] answers = {'A', 'B', 'C', 'B', 'C'};
        int score = 0;

        System.out.println("=== QUIZ GAME ===");
        System.out.println("Type A, B, C, or D to answer.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("🎯 Quiz Over!");
        System.out.println("Your Score: " + score + " out of " + questions.length);
        
        if (score == questions.length)
            System.out.println("🏆 Excellent! Perfect Score!");
        else if (score >= 3)
            System.out.println("👍 Good Job!");
        else
            System.out.println("💪 Keep Practicing!");
    }
}
