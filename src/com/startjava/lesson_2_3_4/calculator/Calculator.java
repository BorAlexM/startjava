package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int number1;
    private int number2;
    private String operation;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void calculate(int number1, int number2, String operation) {
        switch (operation) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            case "^":
                System.out.println(Math.pow(number1, number2));
                break;
            case "%":
                System.out.println(number1 % number2);
                break;
            case "max":
                System.out.println(Math.max(number1, number2));
                break;
            case "min":
                System.out.println(Math.min(number1, number2));
                break;
            case "sin":
                System.out.println(Math.sin(number1));
                break;
            case "cos":
                System.out.println(Math.cos(number2));
                break;
             default:
                System.out.println("Данной математической операции не существует! Попробуйте снова.");
        }
    }
}