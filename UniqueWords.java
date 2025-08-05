import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        // Split sentence into words
        String[] words = sentence.toLowerCase().split("\\s+");

        // Use HashSet to store unique words
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        // Convert to list and sort
        List<String> sortedWords = new ArrayList<>(uniqueWords);
        Collections.sort(sortedWords);

        // Display the result
        System.out.println("Unique words in alphabetical order:");
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}