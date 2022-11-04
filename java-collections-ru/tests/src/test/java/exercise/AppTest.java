package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int n = 3;
        List<Integer> result = App.take(list, n);
        List<Integer> correctAnswer = List.of(1, 2, 3);

        assertThat(result).isEqualTo(correctAnswer);
        // END
    }
}
