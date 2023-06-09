package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13To58Then6dot40() {
        int x1 = 1;
        int y1 = 3;
        int x2 = 5;
        int y2 = 8;
        double expected = 6.40;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42To69Then7dot28() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 6;
        int y2 = 9;
        double expected = 7.28;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}