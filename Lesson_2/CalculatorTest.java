import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Scanner numbers = new Scanner( System.in );
        Scanner operationsScan = new Scanner( System.in );
        Scanner answer = new Scanner( System.in );

        System.out.println( "Введите первое число: " );
        int number1 = numbers.nextInt();
        System.out.println( "Введите знак математической операции" );
        char operations = operationsScan.next().charAt( 0 );
        System.out.println( "Ввведите второе число: " );
        int number2 = numbers.nextInt();
        calc.setNumber1( number1 );
        calc.setOperation( operations );
        calc.setNumber2( number2 );

        calc.operations();

        System.out.println( "Хотите продолжить? [да/нет]" );
        String answer1 = answer.nextLine();

        while (!"да".equals( answer1 ) && !"нет".equals( answer1 )) {
            System.out.println( "Хотите продолжить? [да/нет]" );

        }

    }
}