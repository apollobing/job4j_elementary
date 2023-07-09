package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax56To7Then56() {
        int first = 56;
        int second = 7;
        int result = Max.max(first, second);
        int expected = 56;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax41To41Then41() {
        int first = 41;
        int second = 41;
        int result = Max.max(first, second);
        int expected = 41;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To31To78Then78() {
        int first = 2;
        int second = 31;
        int third = 78;
        int result = Max.max(first, second, third);
        int expected = 78;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax12To29To46To49Then49() {
        int first = 12;
        int second = 29;
        int third = 46;
        int fourth = 49;
        int result = Max.max(first, second, third, fourth);
        int expected = 49;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To7To7To7Then7() {
        int first = 7;
        int second = 7;
        int third = 7;
        int fourth = 7;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}