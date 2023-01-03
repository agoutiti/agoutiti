package com.edu.Car;

import org.junit.jupiter.api.Test;

public class carTest {
	@Test
	public void 자동차_장착_타이어브랜드_테스트() {
//		Tire tire = new KRTire();
		Tire tire = new USTire();
		
		Car car = new Car();
		
//		car.setTire(tire);
		 	System.out.println("현재 장착된 타이어는 "+car.getTireBrand());
	}
	
}
