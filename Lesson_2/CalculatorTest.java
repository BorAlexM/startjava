import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Введите первое число: ");
        Scanner numbers = new Scanner(System.in);
        int number1 = numbers.nextInt();
        System.out.println("Введите знак математической операции");
        Scanner operations = new Scanner(System.in);
        String operation = operations.nextLine();
        System.out.println("Ввведите второе число: ");
        int number2 = numbers.nextInt();
        calc.setNumber1(number1);
        calc.setOperation(operation);
        calc.setNumber2(number2);
        System.out.println(calc.getNumber1() + calc.getOperation() + calc.getNumber2());
    }
}