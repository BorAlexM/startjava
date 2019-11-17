package com.startjava.lesson_2_3.other;
/*
Создайте в классе методы, описывающие поведение (что он может делать) человека: идти, сидеть, бежать, говорить, учить Java
*/
public class Person {
	
	String sex = "Male";
	String personName = "Rob";
	float height = 1.72f;
	float weigth = 81.6f;
	int personAge = 36;

	void go() {
		
	}

	void sit() {
		
	}

	void run() {
		
	}

	void talk() {
		
	}

	boolean teachJava() {
		System.out.println(personName + " учит Java");
		return true;
	}	
}