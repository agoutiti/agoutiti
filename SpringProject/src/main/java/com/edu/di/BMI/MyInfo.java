package com.edu.di.BMI;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class MyInfo {
	
	private String name; //  사용자 이름
	private double height; 
	private double weight; 
	private ArrayList<String> hobby;
	
	private Calculator calculator;
	
	public void calculator() {
		calculator.calculator(weight, height);
		
		
	}
	public void getInfo() {
		System.out.println("Name: "+ name);
		System.out.println("Height: "+ height);
		System.out.println("Weight: "+ weight);
		System.out.println("Hobby: " + hobby);
		calculator();
	}
	
	 
}


