package ru.job4j.calculator;

public class Fit {

    private static final float COEFFICIENT = 1.15f;

    public static double manWeight(short height) {
        double rsl = (height - 100) * COEFFICIENT;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * COEFFICIENT;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);

        height = 160;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 160 is " + woman);
    }

}