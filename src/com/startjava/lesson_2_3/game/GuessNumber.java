package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Player p1;
    Player p2;
    int numberToGuess = (int)(Math.random() * 101);

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void startGame() {
        System.out.println("Компьютер загадывает число от 0 до 100...");

        while (true) {
            System.out.println(pl.getName() + " введите число, которое считаете, что загадал компьютер");
            pl.setNumber(scan.nextInt());
            System.out.println(pl.getName() + " думает, это число " + p1.getNumber());

            if (p1.getNumber() == numberToGuess) {
                System.out.println("У нас есть победитель");
                System.out.println(pl.getName() + " угадал!!!");
                System.out.println("Конец игры");
                break;
            } else if (p1.getNumber() < numberToGuess) {
                System.out.println(pl.getName() + " введенное Вами число меньше того, что загадал компьютер");
            } else if (p1.getNumber() > numberToGuess) {
                System.out.println(pl.getName() + " введенное Вами число больше того, что загадал компьютер");
            }

            System.out.println(p2.getName() + " введите число, которое считаете, что загадал компьютер");
            p2.setNumber(scan.nextInt());
            System.out.println(p2.getName() + " думает, это число " + p2.getNumber());

            if (p2.getNumber() == numberToGuess) {
                System.out.println("У нас есть победитель");
                System.out.println(p2.getName() + " угадал!!!");
                System.out.println("Конец игры");
                break;
            } else if (p2.getNumber() < numberToGuess) {
                System.out.println(p2.getName() + " введенное Вами число меньше того, что загадал компьютер");
            } else if (p2.getNumber() > numberToGuess) {
                System.out.println(p2.getName() + " введенное Вами число больше того, что загадал компьютер");
            }
            System.out.println("Вам необходимо попробовать ещё раз");
        }
    }
}