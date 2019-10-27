public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;

        System.out.println("ModelName = " + this.modelName);
        System.out.println("Mark = " + this.mark);
        System.out.println("Origin = " + this.origin);
        System.out.println("Height = " + this.height + "m");
        System.out.println("Weight = " + this.weight + " tons");
        System.out.println("Speed = " + this.speed);
        System.out.println("Strength = " + this.strength);
        System.out.println("Armor = " + this.armor);
    }
}