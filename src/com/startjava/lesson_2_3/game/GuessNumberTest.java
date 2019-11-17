package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerAnswer;
        do {
            System.out.print("Введите имя первого игрока");
            Player p1 = new Player(scan.nextLine());
            System.out.print("Введите имя второго игрока");
            Player p2 = new Player(scan.nextLine());
            GuessNumber game = new GuessNumber(p1, p2);
            game.startGame();
            do {
                System.out.print("Хотите продолжить? [да/нет]");
                playerAnswer = scan.nextLine();
            } while (!"нет".equals(playerAnswer) && !"да".equals(playerAnswer));
        } while (!"нет".equals(playerAnswer));
    }
}