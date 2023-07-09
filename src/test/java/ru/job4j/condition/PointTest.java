package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13To58Then6dot40() {
        Point a = new Point(1, 3);
        Point b = new Point(5, 8);
        double expected = 6.40;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42To69Then7dot28() {
        Point a = new Point(4, 2);
        Point b = new Point(6, 9);
        double expected = 7.28;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}