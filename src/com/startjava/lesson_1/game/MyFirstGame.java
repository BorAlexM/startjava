package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 50;
        int myNumber = 10;

        System.out.println("Start!!!");

        while(true) {
            if(myNumber == computerNumber) {
                System.out.println("Вы угадали!!!");
                break;
            } else if(myNumber > computerNumber) {
                System.out.println("Вы ввели число > чем то, что ввел компьютер!!");
                myNumber--;
            } else if(myNumber < computerNumber) {
                System.out.println("Вы ввели число < чем то, что ввел компьютер!!");
                myNumber++;
            } 
        }
    }
}