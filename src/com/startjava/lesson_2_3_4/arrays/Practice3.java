package com.startjava.lesson_2_3_4.arrays;

import java.util.Arrays;

public class Practice3 {
    /*
    Элементы массива, которые меньше среднего арифметического
    Найти в массиве те элементы, значение которых меньше среднего арифметического, взятого от всех элементов массива.
    */
    public static void main(String[] args) {
        int [] mas1 = new int[5];

        for (int i = 0; i < 5; i++) {
            mas1[i] = (int)(Math.random()*6);
        }
        System.out.println(Arrays.toString(mas1));

        double average1 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += mas1[i];
        }
        average1/=5;

        for (int i = 0; i < 5; i++) {
            average1 += mas1[i];
        }
    }
}
