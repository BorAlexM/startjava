import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        do {
            Calculator calc = new Calculator();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            calc.setNumber1(number1);
            System.out.println("Введите знак математической операции");
            char calculate = scanner.next().charAt(0);
            calc.setCalculate(calculate);
            System.out.println("Ввведите второе число: ");
            int number2 = scanner.nextInt();
            calc.setNumber2(number2);       
            calc.calculate();
            do {
                System.out.println("Хотите продолжить? [да/нет]");
                answer = scanner.next();
            } while (!"нет".equals(answer) && !"да".equals(answer));
        } while (!"нет".equals(answer));
    }
}