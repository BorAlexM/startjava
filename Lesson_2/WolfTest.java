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

        wolfOne.setSex("She-wolf");
        wolfOne.setWolfNickName("Tory");
        wolfOne.setWeigth(35.2f);
        wolfOne.setWolfAge(4);
        wolfOne.setWolfColor("Gray");
        System.out.println("sex = " + wolfOne.getSex());
        System.out.println("wolfNickName = " + wolfOne.getWolfNickName());
        System.out.println("weigth = " + wolfOne.getWeigth());
        System.out.println("wolfAge = " + wolfOne.getWolfAge());
        System.out.println("wolfColor = " + wolfOne.getWolfColor());
    }
}