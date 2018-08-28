package com.di.ex2;

import java.util.ArrayList;

//com.di.ex.MyCats와 다르게 .setter()가 없고 
//생성자를 이용하여 applicationContext2.xml에서 name, age, hobby를 인자로 받아와
//필드에 있는 name, age, hobbys를 초기화 시켜줌.
public class MyCats {
	private String name;
	private int age;
	private ArrayList<String> hobbys;
	
	
	//생성자 통해 name, age, hobbys를 받아와 각각의 필드를 초기화 시켜줌.
	public MyCats(String name, int age, ArrayList<String> hobbys) {
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}
	
	//정보 출력을 위한 getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public ArrayList<String> getHobbys(){
		return hobbys;
	}
}
