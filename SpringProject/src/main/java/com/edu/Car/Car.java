package com.edu.Car;

import org.springframework.beans.factory.annotation.Autowired;

public class Car { 
	@Autowired //6번째 예제
	Tire tire;
	
//	public Car() {
//		tire = new KRTire();
//	}
//	public String getTireBrand() {
//		return " Now " + tire.getBrand(); 		
//	}
	
	
// 2번째 예제는 스프링 없이 의존성 주입: 생성자를 통해서 의존성을 주입한다	
//	public Car(Tire tire) { // 2번째 예제는 타이어의 종류를 생성자 통해서 설정.
//		this.tire = tire;
//	}
 
//	public Tire getTire() {
//		return tire;
//	}
//	public void setTire(Tire tire) {
//		this.tire = tire;
//	}
	
	public String getTireBrand() {
		return "Now "+tire.getBrand();
	}
	
}

