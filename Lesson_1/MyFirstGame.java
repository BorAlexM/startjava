public class MyFirstGame {
    public static void main(String[] args) {
        int targetNumber = 10;
        int[] numbers = new int[]{2, 3, 5, 13, 55, 10};

        System.out.println("Я загадываю число от 0 до 100...");

        for (int i = 0; i < number.length; i++) {
            if (numbers[i] < targetNumber) {
                System.out.println("Введенное Вами число меньше того, что загадал компьютер");
            } else if (numbers[i] > targetNumber) {
                System.out.println("Введенное Вами число больше того, что загадал компьютер");
            }

            if (numbers[i] != targetNumber) {
                System.out.println("Попробуйте снова");
            }
        }
        System.out.println("Вы угадали!");
    }
}