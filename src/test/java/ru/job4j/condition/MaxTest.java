package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax56To7Then56() {
        int left = 56;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 56;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax41To41Then41() {
        int left = 41;
        int right = 41;
        int result = Max.max(left, right);
        int expected = 41;
        assertThat(result).isEqualTo(expected);
    }
}