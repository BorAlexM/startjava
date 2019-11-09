import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        String play;
        do {
            System.out.println("Введите имя первого игрока");
            Player p1 = new Player(scan.nextLine());
            System.out.println("Введите имя второго игрока");
            Player p2 = new Player(scan.nextLine());
            game.startGame(p1, p2, (int)(Math.random() * 101));
            do {
                System.out.println("Хотите продолжить? [да/нет]");
                play = scan.nextLine();
            } while (!"нет".equals(play) && !"да".equals(play));
        } while (!"нет".equals(play));
    }
}