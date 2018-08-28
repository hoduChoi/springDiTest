package com.di.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//메인 클래스
public class StudyDI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bean 설정한 xml파일이 있는 위치 지정.
		String configLocation = "classpath:applicationContext.xml";
		
		//지정한 위치 참고하여 설정파일 얻어옴.
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyCats myCat = ctx.getBean("myCats", MyCats.class);
		
		myCat.catsNameInfo();
		myCat.catsAgeInfo();
		
		ctx.close();
	}

}
