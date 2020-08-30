package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {
    private static final double DELTA = 0.01;

    @Test
    public void whenMan178Then89Dot7() {
        short in = 178;
        double expected = 89.7;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, DELTA);
    }

    @Test
    public void whenWoman160Then57Dot5() {
        short in = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, DELTA);
    }
}