public class GuessNumberTest {
	public static void main(String[] args) {
        Player playerOne = new Player("Rob");
        Player playerTwo = new Player("Bob");

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        String scanName1 = scan.nextLine();
        System.out.println("Введите имя второго игрока");
        String scanName2 = scan.nextLine();
        playerOne.setName(scanName1);
        playerTwo.setName(scanName2);

        System.out.println("Я загадываю число от 0 до 100...");
        int compNumber = (int)(Math.random() * 100);

        while (true){
            System.out.println("Введите Ваше число от 0 до 100: ");
            System.out.println("Игрок " + playerOne.getName() + " введите предполагаемое Вами число");
            int numberPlayerOne = scan.nextInt();
            System.out.println("Игрок " + playerTwo.getName() + " введите предполагаемое Вами число");
            int numberPlayerTwo = scan.nextInt();

            if (numberPlayerOne == compNumber || numberPlayerTwo == compNumber){
                System.out.println("Вы угадали");
                break;
            }
        }
	}
}