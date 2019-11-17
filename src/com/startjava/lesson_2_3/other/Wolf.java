package com.startjava.lesson_2_3.other;
/*
напишите в нем поля: пол, кличка, вес, возраст, окрас
напишите в нем методы: идти, сидеть, бежать, выть, охотиться
*/
public class Wolf {
	
    private String sex;
    private String nickName;
    private float weigth;
    private int wolfAge;
    private String Color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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