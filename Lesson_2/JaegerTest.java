public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();

        jaegerOne.setModelName("Tactic Ronin");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setOrigin("Japan");
        jaegerOne.setHeight(74.37f);
        jaegerOne.setWeight(7.450f);
        jaegerOne.setSpeed(8);
        jaegerOne.setStrength(7);
        jaegerOne.setArmor(3);

        jaegerTwo.setModelName("Romeo Blue");
        jaegerTwo.setMark("Mark-1");
        jaegerTwo.setOrigin("USA");
        jaegerTwo.setHeight(77.72f);
        jaegerTwo.setWeight(7.775f);
        jaegerTwo.setSpeed(2);
        jaegerTwo.setStrength(7);
        jaegerTwo.setArmor(6);

        System.out.println("Данные по первому роботу!");
        System.out.println("ModelName = " + jaegerOne.getModelName());
        System.out.println("Mark = " + jaegerOne.getMark());
        System.out.println("Origin = " + jaegerOne.getOrigin());
        System.out.println("Height = " + jaegerOne.getHeight() + jaegerOne.getUnitsOfChange1());
        System.out.println("Weight = " + jaegerOne.getWeight() + " " + jaegerOne.getUnitsOfChange2());
        System.out.println("Speed = " + jaegerOne.getSpeed());
        System.out.println("Strength = " + jaegerOne.getStrength());
        System.out.println("Armor = " + jaegerOne.getArmor());
        System.out.println();

        System.out.println("Данные по второму роботу!");
        System.out.println("ModelName = " + jaegerTwo.getModelName());
        System.out.println("Mark = " + jaegerTwo.getMark());
        System.out.println("Origin = " + jaegerTwo.getOrigin());
        System.out.println("Height = " + jaegerTwo.getHeight() + jaegerTwo.getUnitsOfChange1());
        System.out.println("Weight = " + jaegerTwo.getWeight() + " " + jaegerTwo.getUnitsOfChange2());
        System.out.println("Speed = " + jaegerTwo.getSpeed());
        System.out.println("Strength = " + jaegerTwo.getStrength());
        System.out.println("Armor = " + jaegerTwo.getArmor());
    }
}