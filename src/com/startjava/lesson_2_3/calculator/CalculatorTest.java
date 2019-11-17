package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer;

        do {
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Введите знак математической операции");
            char operation = scanner.next().charAt(0);
            System.out.println("Ввведите второе число: ");
            int number2 = scanner.nextInt();
            calc.calculate(number1, number2, operation);

            do {
                System.out.println("Хотите продолжить? [да/нет]");
                answer = scanner.next();
            } while (!"нет".equals(answer) && !"да".equals(answer));
        } while (!"нет".equals(answer));
    }
}