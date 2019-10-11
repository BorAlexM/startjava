public class ConditionalStatement {
	public static void main(String[] args) {
		int yourAge = 25;
		if(yourAge > 20) {
			System.out.println ("Вы закончили школу");
		}

		boolean isMan = true;
		if(isMan) {
			System.out.println ("Вы мужчина");
		}

		float yourHeight = 1.50f;
		if(yourHeight < 1.80) {
			System.out.println ("Вы среднестатистический");
		}	else {
			System.out.println ("Вы высокий");
		}

		char firstLetterYourName = 'A';
		if(firstLetterYourName == 'M') {
			System.out.println ("Вас зовут Michael");
		}	else if (firstLetterYourName == 'I') {
			System.out.println ("Вас зовут Ignat");
		}	else {
			System.out.println ("Вас зовут Alex");
		}	
	}
}