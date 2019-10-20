public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operation1 = '0';

        if (operation1 == '+') {
            System.out.println(num1 + num2);
        } else if (operation1 == '-') {
            System.out.println(num1 - num2);
        } else if (operation1 == '*') {
            System.out.println(num1 * num2);
        } else if (operation1 == '/') {
            System.out.println(num1 / num2);
        } else if (operation1 == '^') {
        int power = 1;
            for (int i = 0; i < num2; i++) {
                power *= num1;
            }
            System.out.println(power);
        } else if (operation1 == '%') {
            System.out.println(num1 % num2);
        }
    }
}