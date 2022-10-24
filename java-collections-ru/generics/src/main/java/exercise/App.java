package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static <T> List<Map<T, T>> findWhere(List<Map<T, T>> listBooks, Map<T, T> comparison) {
       List<Map<T, T>> result = new ArrayList<>();

        for (Map<T, T> book : listBooks) {
           for (Map.Entry<T, T> characteristic : comparison.entrySet()) {
               if (book.containsValue(characteristic.getValue())) {
                   if (!result.contains(book)) {
                       result.add(book);
                   }
               } else {
                   result.remove(book);
                   break;
               }
           }
       }

        return result;
    }
}
//END
