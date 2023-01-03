package com.edu.di.BMI;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Calculator {

	// 체질량 계산에 기준이 되는 변수들
	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obesity;
	
	
	public void calculator(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h*h);
		
		if (result > obesity) {
			System.out.println("비만쓰");
		}else if (result>overWeight) {
			System.out.println("과체중쓰");
		}else if (result > normal) {
			System.out.println("노말쓰");
		}else {
		System.out.println("저체중쓰");	
		}
	}
	
	
	
}
