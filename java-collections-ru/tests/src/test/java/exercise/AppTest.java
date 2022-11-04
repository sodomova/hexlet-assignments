package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake1() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> correctAnswer = List.of(1, 2, 3);
        List<Integer> result = App.take(list, 3);

        assertThat(result).isEqualTo(correctAnswer);
    }

    @Test
    void testTake2() {
        List<Integer> list = new ArrayList<>();
        List<Integer> correctAnswer = new ArrayList<>();
        List<Integer> result = App.take(list, 3);

        assertThat(result).isEqualTo(correctAnswer);
    }

    @Test
    void testTake3() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> correctAnswer = List.of(1, 2, 3, 4, 5);
        List<Integer> result = App.take(list, 8);

        assertThat(result).isEqualTo(correctAnswer);
    }
}
