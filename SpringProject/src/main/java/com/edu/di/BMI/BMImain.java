package com.edu.di.BMI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BMImain {
	public static void main(String[] args) {
		String conf = "classpath:applicationContext.xml"; // classpath는 scr/main/resources를 가리키는거임
		ApplicationContext ctx = new GenericXmlApplicationContext(conf); // 스프링 컨테이너가 형성된다
	 MyInfo myinfo = ctx.getBean("MyInfo", MyInfo.class); //스프링 컨테이너에서 컴포넌트 가져온다
	 
	 myinfo.getInfo();
		
	}
}