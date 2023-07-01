package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {77, -29, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-29, 11, 77};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {33, 55, 11, 22, 44};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {11, 22, 33, 44, 55};
        assertThat(result).containsExactly(expected);
    }
}
