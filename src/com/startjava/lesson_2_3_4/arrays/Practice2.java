package com.startjava.lesson_2_3_4.arrays;

import java.util.Arrays;

public class Practice2 {
    /*
    Максимальный из элементов массива с четными индексами
    В массиве найти максимальный элемент с четным индексом.
    Другая формулировка задачи: среди элементов массива с четными индексами, найти тот, который имеет максимальное значение.
     */
    public static void main(String[] args) {
        int [] mas = new int [12];
        int a = -15;
        int b = 15;
        int maxNumber = a - 1;
        int index = 0;

        for (int i=0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*(b-a+1)+a);
            if(maxNumber <= mas[i] && i%2 == 0){
                maxNumber = mas[i];
                index = i;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(index);
    }
}
