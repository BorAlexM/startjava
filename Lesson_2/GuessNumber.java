import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Player p1;
    Player p2;

    public void startGame (){
        p1 = new Player();
        p2 = new Player();
        int guessp1 = 0;
        int guessp2 = 0;
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
                System.out.println("Число которое необходимо угадать, = " + numberToGuess);

                p1.guess();
                p2.guess();

                guessp1 = p1.getNumber();
                System.out.println(nameP1 + " думает, это число " + guessp1);
                guessp2 = p2.getNumber();
                System.out.println(nameP2 + " думает, это число " + guessp2);

                if (guessp1 == numberToGuess){
                    p1isRight = true;
                }
                if (guessp2 == numberToGuess){
                    p2isRight = true;
                }
                if (p1isRight || p2isRight){
                    System.out.println("У нас есть победитель");
                    System.out.println("Первый игрок угадал?" + p1isRight);
                    System.out.println("Второй игрок угадал?" + p2isRight);
                    System.out.println("Конец игры");
                    break;
                } else {
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