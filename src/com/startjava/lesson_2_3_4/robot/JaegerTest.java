package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Tactic Ronin", "Mark-1", "Japan", 74.37f, 7.450f, 8, 7, 3);
        System.out.println("Данные по первому роботу!");
        System.out.println("ModelName = " + jaegerOne.getModelName());
        System.out.println("Mark = " + jaegerOne.getMark());
        System.out.println("Origin = " + jaegerOne.getOrigin());
        System.out.println("Height = " + jaegerOne.getHeight() + "m");
        System.out.println("Weight = " + jaegerOne.getWeight() + " tons");
        System.out.println("Speed = " + jaegerOne.getSpeed());
        System.out.println("Strength = " + jaegerOne.getStrength());
        System.out.println("Armor = " + jaegerOne.getArmor());
        System.out.println();

        Jaeger jaegerTwo = new Jaeger("Romeo Blue","Mark-1", "USA", 77.72f, 7.775f, 2, 7, 6);
        System.out.println("Данные по второму роботу!");
        System.out.println("ModelName = " + jaegerTwo.getModelName());
        System.out.println("Mark = " + jaegerTwo.getMark());
        System.out.println("Origin = " + jaegerTwo.getOrigin());
        System.out.println("Height = " + jaegerTwo.getHeight() + "m");
        System.out.println("Weight = " + jaegerTwo.getWeight() + " tons");
        System.out.println("Speed = " + jaegerTwo.getSpeed());
        System.out.println("Strength = " + jaegerTwo.getStrength());
        System.out.println("Armor = " + jaegerTwo.getArmor());
	}
}