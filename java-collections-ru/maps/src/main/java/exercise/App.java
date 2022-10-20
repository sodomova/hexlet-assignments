package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> wordsInSentence = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()){
                if (!wordsInSentence.containsKey(word)) {
                    wordsInSentence.put(word, 1);
                } else {
                    wordsInSentence.put(word, wordsInSentence.get(word) + 1);
                }
            }
        }

        return wordsInSentence;
    }

    public static String toString(Map<String, Integer> wordsInSentence) {
        if (wordsInSentence.isEmpty()) {
            return "{}";
        }

        StringBuilder result = new StringBuilder("{\n");

        for (String word: wordsInSentence.keySet()) {
            String line = "  " + word + ": " + wordsInSentence.get(word) + "\n";
            result.append(line);
        }

        result.append("}");

        return result.toString();
    }
}
//END
