package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double sumToPay = amount;

        while (sumToPay > 0) {
            year++;
            sumToPay = sumToPay + sumToPay * (percent / 100);
            sumToPay -= salary;
        }
        return year;
    }
}