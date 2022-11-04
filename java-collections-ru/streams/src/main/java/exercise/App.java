package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        long count = emails.stream()
                .filter(email -> email.contains("@gmail.com") || email.contains("@yandex.ru")
                        || email.contains("@hotmail.com"))
                .count();

        return (int) count;
    }
}
// END
