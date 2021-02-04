package com.startjava.lesson_2_3_4.arrays;

import java.util.Arrays;

public class Practice {
    /*
    Сумма положительных элементов массива
    В массиве, содержащем положительные и отрицательные целые числа, вычислить сумму четных положительных элементов.
    */
    public static void main(String args[]) {
        int [] mas = new int[20];
        int evenNums = 0;
        int sumPositiveNumber = 0;

        for (int i=0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*24-5);
            if(mas[i]%2 == 0 && mas[i] > 0){
                evenNums++;
                sumPositiveNumber += mas[i];
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(evenNums);
        System.out.println(sumPositiveNumber);
    }
}


