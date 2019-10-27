public class WolfTest {
		
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("She-wolf");
        wolfOne.setNickName("Tory");
        wolfOne.setWeigth(35.2f);
        wolfOne.setWolfAge(4);
        wolfOne.setColor("Gray");

        System.out.println("sex = " + wolfOne.getSex());
        System.out.println("nickName = " + wolfOne.getNickName());
        System.out.println("weigth = " + wolfOne.getWeigth());
        System.out.println("wolfAge = " + wolfOne.getWolfAge());
        System.out.println("color = " + wolfOne.getColor());
    }
}