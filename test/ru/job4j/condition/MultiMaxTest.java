package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(7, 4, 3);
        assertThat(result, is(7));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(4, 7, 9);
        assertThat(result, is(9));
    }
}