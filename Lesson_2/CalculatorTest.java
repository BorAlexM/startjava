import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer;
        
        do {
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            calc.setNumber1(number1);
            System.out.println("Введите знак математической операции");
            char calculate = scanner.next().charAt(0);
            calc.setOperation(calculate);
            System.out.println("Ввведите второе число: ");
            int number2 = scanner.nextInt();
            calc.setNumber2(number2);
            calc.calculate(number1, number2, calculate);

                do {
                    System.out.println( "Хотите продолжить? [да/нет]" );
                    answer = scanner.next();
                } while (!"нет".equals(answer) && !"да".equals(answer));
        } while (!"нет".equals(answer));
    }
}