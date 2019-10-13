public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		if(age > 20) {
			System.out.println("Вы закончили школу");
		}

		boolean isMan = true;
		if(isMan) {
			System.out.println("Вы мужчина");
		}

		boolean isNotan = true;
		if(isNotMan) {
			System.out.println("Вы женщина");
		}

		float yourHeight = 1.50f;
		if(yourHeight < 1.80) {
			System.out.println("Вы среднестатистический");
		} else {
			System.out.println("Вы высокий");
		}

		char firstLetterYourName = 'A';
		if(firstLetterYourName == 'M') {
			System.out.println("Вас зовут Michael");
		} else if (firstLetterYourName == 'I') {
			System.out.println("Вас зовут Ignat");
		} else {
			System.out.println("Вас зовут Alex");
		}	
	}
}