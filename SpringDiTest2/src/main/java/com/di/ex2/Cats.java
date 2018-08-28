package com.di.ex2;

public class Cats {
	private MyCats myCats;
	
	//생성자를 통해 mycats를 인수로 받아와서 myCats를 초기화 시켜줌.
	//com.di.ex.Cats와  다르게 생성자를 통해 myCats를 인수로 받아서 초기화 시킴.
	public Cats(MyCats myCats) {
		this.myCats = myCats;
	}
	
	public void getMyCatsInfo() {
		System.out.println("===================");
		System.out.println("야옹이 이름: "+myCats.getName());
		System.out.println("야옹이 나이: "+myCats.getAge());
		System.out.println("야옹이 취미: "+myCats.getHobbys());
		System.out.println("===================");
	}
	
	
}
