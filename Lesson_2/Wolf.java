	/*
		напишите в нем поля: пол, кличка, вес, возраст, окрас
		напишите в нем методы: идти, сидеть, бежать, выть, охотиться
	*/

public class Wolf {
	
    private String sex;
    private String wolfNickName;
    private float weigth;
    private int wolfAge;
    private String wolfColor;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWolfNickName() {
        return wolfNickName;
    }

    public void setWolfNickName(String wolfNickName) {
        this.wolfNickName = wolfNickName;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public int getWolfAge() {
        return wolfAge;
    }

    public void setWolfAge(int wolfAge) {
        if(wolfAge > 8){
            System.out.println("Некорректный возраст");
        }
        this.wolfAge = wolfAge;
    }

    public String getWolfColor() {
        return wolfColor;
    }

    public void setWolfColor(String wolfColor) {
        this.wolfColor = wolfColor;
    }

    public void go() {

    }

    public void sit() {

    }

    public void run() {

    }

    public void howl() {

    }

    public void hunt() {

    }	
}