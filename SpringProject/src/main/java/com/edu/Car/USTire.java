package com.edu.Car;

public class USTire implements Tire {
// 인터페이스를 이용하는 클래스는 인터페이스에 있는 모든 추상메서드 구현해야함
	@Override
	public String getBrand() {	
		return "US Tire";
	}

}
