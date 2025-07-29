import java.util.HashMap;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.toLowerCase().split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", ""); // Clean punctuation
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Word Frequencies:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " : " + wordCount.get(word));
        }

        sc.close();
    }
}