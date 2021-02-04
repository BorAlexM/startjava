package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer;

        do {
            int number1 = scanner.nextInt();
            String operation = scanner.next();
            int number2 = scanner.nextInt();
            System.out.println("Введите математическое выражение: " + number1 + operation + number2);
            calc.calculate(number1, number2, operation);

            do {
                System.out.println("Хотите продолжить? [да/нет]");
                answer = scanner.next();
            } while (!"нет".equals(answer) && !"да".equals(answer));
        } while (!"нет".equals(answer));
    }
}