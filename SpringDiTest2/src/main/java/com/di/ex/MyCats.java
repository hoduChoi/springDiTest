package com.di.ex;

//필요한 필드 선언 후 setter를 만들어 줌.
//catsNameInfo, catsAgeInfo 메서드를 생성하여 직접 처리 안하고 
//DiCats 클래스를 사용해서 처리.
public class MyCats {
	Cats dicats;
	private String firstCatName;
	private int firstCatAge;
	private String secondCatName;
	private int secondCatAge;
	
	public void catsNameInfo() {
		dicats.catsName(firstCatName, secondCatName);
	}
	
	public void catsAgeInfo() {
		dicats.catsAge(firstCatAge, secondCatAge);
	}
	
	public void setCats(Cats dicats) {
		this.dicats = dicats;
	}
	
	
	public void setFirstCatName(String firstCatName) {
		this.firstCatName = firstCatName;
	}
	
	public void setSecondCatName(String secondCatName) {
		this.secondCatName = secondCatName;
	}
	
	public void setFirstCatAge(int firstCatAge) {
		this.firstCatAge = firstCatAge;
	}
	
	public void setSecondCatAge(int secondCatAge) {
		this.secondCatAge = secondCatAge;
	}
}
