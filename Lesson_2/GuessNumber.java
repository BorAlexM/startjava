import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Player p1;
    Player p2;

    public void startGame (){
        p1 = new Player();
        p2 = new Player();
        boolean p1isRight = false;
        boolean p2isRight = false;
        String play;

        do {
            System.out.println("Введите имя первого игрока");
            String nameP1 = scan.nextLine();
            System.out.println("Введите имя второго игрока");
            String nameP2 = scan.nextLine();
            System.out.println("Компьютер загадывает число от 0 до 100...");
            int numberToGuess = (int)(Math.random() * 101);

            while (true) {
                System.out.println(nameP1 + " введите число, которое считаете, что загадал компьютер");
                int numberP1 = scan.nextInt();
                p1.setNumber(numberP1);
                System.out.println(nameP1 + " думает, это число " + numberP1);
                System.out.println(nameP2 + " введите число, которое считаете, что загадал компьютер");
                int numberP2 = scan.nextInt();
                p2.setNumber(numberP2);
                System.out.println(nameP2 + " думает, это число " + numberP2);

                if (numberP1 == numberToGuess){
                    p1isRight = true;
                }
                if (numberP2 == numberToGuess){
                    p2isRight = true;
                }
                if (p1isRight || p2isRight){
                    System.out.println("У нас есть победитель");
                    System.out.println("Компьютер загадал число " + numberToGuess);
                    System.out.println("Конец игры");
                    break;
                } else {
                    if (numberP1 < numberToGuess) {
                        System.out.println(nameP1 + " введенное Вами число больше того, что загадал компьютер");
                    } else if (numberP1 > numberToGuess) {
                        System.out.println(nameP1 + " введенное Вами число меньше того, что загадал компьютер");
                    }
                    if (numberP2 < numberToGuess) {
                        System.out.println(nameP2 + " введенное Вами число больше того, что загадал компьютер");
                    } else if (numberP2 > numberToGuess) {
                        System.out.println(nameP2 + " введенное Вами число меньше того, что загадал компьютер");
                    }
                    System.out.println("Вам необходимо попробовать ещё раз");
                }
            }
            do {
                System.out.println( "Хотите продолжить? [да/нет]" );
                play = scan.next();
            } while (!"нет".equals(play) && !"да".equals(play));
        } while (!"нет".equals(play));
    }
}