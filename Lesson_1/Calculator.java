public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int power = 3;
        char operation1 = '+';
        char operation2 = '-';
        char operation3 = '*';
        char operation4 = '/';
        char operation5 = '^';
        char operation6 = '%';
        
        if (operation1 == '+') {
            System.out.println(num1 + num2);
        } else if (operation2 == '-') {
            System.out.println(num1 - num2);
        } else if (operation3 == '*') {
            System.out.println(num1 * num2);
        } else if (operation4 == '/') {
            System.out.println(num1 / num2);
        } else if (operation5 == '^') {
            for (int i = 0; i < power; i++) {
                num1 *= 10;
            }
            System.out.println(num1);
        } else if (operation6 == '%') {
            System.out.println(num1 % num2);
        }
    }
}