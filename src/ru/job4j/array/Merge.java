package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0; // Текущий индекс левого массива
        int rightIndex = 0; // Текущий индекс правого массива

        for (int rslIndex = 0; rslIndex < left.length + right.length; rslIndex++) {
            int leftValue;
            int rightValue;
            // Пока не вышли за пределы левого и правого массива - берем данные из обоих и сравниваем
            //      Если вышли за пределы одного из массивов - берем данные из оставшегося
            if (leftIndex < left.length && rightIndex < right.length) {
                leftValue = left[leftIndex];
                rightValue = right[rightIndex];

                if (leftValue < rightValue) {
                    rsl[rslIndex] = leftValue;
                    leftIndex++;
                } else {
                    rsl[rslIndex] = rightValue;
                    rightIndex++;
                }
            } else if (leftIndex < left.length) {
                leftValue = left[leftIndex];
                rsl[rslIndex] = leftValue;
                leftIndex++;
            } else if (rightIndex < right.length) {
                rightValue = right[rightIndex];
                rsl[rslIndex] = rightValue;
                rightIndex++;
            }
        }

        return rsl;
    }
}
