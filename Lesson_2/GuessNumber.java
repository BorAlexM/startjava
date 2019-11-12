import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Player p1;
    Player p2;

    public GuessNumber (Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void startGame(int numberToGuess) {
        System.out.println("Компьютер загадывает число от 0 до 100...");

        while (true) {
            System.out.println(pl.getName() + " введите число, которое считаете, что загадал компьютер");
            int numberP1 = scan.nextInt();
            pl.setNumber(numberP1);
            System.out.println(pl.getName() + " думает, это число " + numberP1);

            if (numberP1 == numberToGuess) {
                System.out.println("У нас есть победитель");
                System.out.println(pl.getName() + " угадал!!!");
                System.out.println("Конец игры");
                break;
            } else if (numberP1 < numberToGuess) {
                System.out.println(pl.getName() + " введенное Вами число меньше того, что загадал компьютер");
            } else if (numberP1 > numberToGuess) {
                System.out.println(pl.getName() + " введенное Вами число больше того, что загадал компьютер");
            }

            System.out.println(p2.getName() + " введите число, которое считаете, что загадал компьютер");
            int numberP2 = scan.nextInt();
            p2.setNumber(numberP2);
            System.out.println(p2.getName() + " думает, это число " + numberP2);

            if (numberP2 == numberToGuess) {
                System.out.println("У нас есть победитель");
                System.out.println(p2.getName() + " угадал!!!");
                System.out.println("Конец игры");
                break;
            } else if (numberP2 < numberToGuess) {
                System.out.println(p2.getName() + " введенное Вами число меньше того, что загадал компьютер");
            } else if (numberP2 > numberToGuess) {
                System.out.println(p2.getName() + " введенное Вами число больше того, что загадал компьютер");
            }
            System.out.println("Вам необходимо попробовать ещё раз");
        }
    }
}