package com.di.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class StudyDI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "classpath:applicationContext2.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		Cats catsInfo = ctx.getBean("catsInfo", Cats.class);
		
		catsInfo.getMyCatsInfo();
		
		ctx.close();
		
	}

}
