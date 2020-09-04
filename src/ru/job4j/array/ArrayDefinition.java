package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];

        names[0] = "Peter";
        names[1] = "Alex";
        names[2] = "Andrey";
        names[3] = "Sergey";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
