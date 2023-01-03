package com.edu.di.Cafe2;

public class Coffee {
// 생성자를 통한 주입(인터페이스 사용)
	private Americano americano;
	
//	public Coffee(Americano ame) {
//		americano = ame;
//	}
	
	public void setCoffee(Americano ame) {
		americano = ame;
	}
	
	public void coffeeType() {// 커피 타입
		System.out.println("주문하신 커피는 "+ americano.getName() + "입니다");
	}
}
