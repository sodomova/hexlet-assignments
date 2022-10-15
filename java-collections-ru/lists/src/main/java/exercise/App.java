package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbolSet, String word) {
        List<String> symbols = new ArrayList<>(Arrays.asList(symbolSet.split("")));
        String[] lettersWord = word.toLowerCase().split("");

        for (String letter : lettersWord) {
            if (!symbols.contains(letter)) {
                return false;
            }
            symbols.remove(letter);
        }

        return true;
    }
}
//END
