		/*
				String sex;
				String wolfNickName;
				float weigth;
				int wolfAge;
				String wolfColor;
		*/
public class WolfTest {
		
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.sex = "She-wolf";
		wolfOne.wolfNickName = "Tory";
		wolfOne.weigth = 35.2f;
		wolfOne.wolfAge = 4;
		wolfOne.wolfColor = "Gray";
		System.out.println("sex = " + wolfOne.sex);
		System.out.println("wolfNickName = " + wolfOne.wolfNickName);
		System.out.println("weigth = " + wolfOne.weigth);
		System.out.println("wolfAge = " + wolfOne.wolfAge);
		System.out.println("wolfColor = " + wolfOne.wolfColor);
	}
}