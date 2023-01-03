package com.edu.di.Cafe2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CoffeeShop {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("com/edu/di/Cafe/applicationContext.xml");

		Coffee coffee= ctx.getBean("coffee", Coffee.class);
		coffee.coffeeType();		
	}

}
