import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String play;
        do {
            System.out.println("Введите имя первого игрока");
            Player p1 = new Player(scan.nextLine());
            System.out.println("Введите имя второго игрока");
            Player p2 = new Player(scan.nextLine());
            GuessNumber game = new GuessNumber(p1, p2);
            game.startGame((int)(Math.random() * 101));
            do {
                System.out.println("Хотите продолжить? [да/нет]");
                play = scan.nextLine();
            } while (!"нет".equals(play) && !"да".equals(play));
        } while (!"нет".equals(play));
    }
}