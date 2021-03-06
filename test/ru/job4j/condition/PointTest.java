package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24To21Then3() {
        int expected = 3;
        int x1 = 2;
        int y1 = 4;
        int x2 = 2;
        int y2 = 1;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13To12Then1() {
        int expected = 1;
        int x1 = 1;
        int y1 = 3;
        int x2 = 1;
        int y2 = 2;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01To31Then3() {
        int expected = 3;
        int x1 = 0;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To200Then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int z1 = 0;
        int x2 = 2;
        int y2 = 0;
        int z2 = 0;
        double out = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when101To201Then1() {
        int expected = 1;
        int x1 = 1;
        int y1 = 0;
        int z1 = 1;
        int x2 = 2;
        int y2 = 0;
        int z2 = 1;
        double out = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }

}