package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        int p = 4;
        double k = 1;
        int expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP20K37Square2dot56() {
        int p = 20;
        double k = 37;
        double expected = 2.56;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}