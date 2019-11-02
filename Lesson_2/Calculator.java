public class Calculator {

    private int number1;
    private int number2;
    private char calculate;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public char getCalculate() {
        return calculate;
    }

    public void setCalculate(char calculate) {
        this.calculate = calculate;
    }

    public boolean calculate() {
        switch (calculate) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '^':
                int result = 1;
                for (int i = 0; i < number2; i++) {
                    result = result * number1;
                }
                System.out.println(result);
                break;
            case '%':
                System.out.println(number1 % number2);
                break;
        }
        return true;
    }
}