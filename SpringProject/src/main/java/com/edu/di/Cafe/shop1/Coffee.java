package com.edu.di.Cafe.shop1;

public class Coffee { //카페 주방...
	private Americano americano;
	
//	public Coffee(Americano ame) {
//		americano = ame;
//    }
//	public void coffeeType() {
//		System.out.println("주문하신 커피는 "+americano.getName()+"입니다");
//	  }
	
	
// setter() 메서드 이용해서 의존성 주입. 객체 생성 걷어내기 위해 의존성 주입하는 예제
	public void setCoffee(Americano americano) {
		this.americano = americano;
	}
	public void coffeeType() {
		System.out.println("주문하신 커피는 "+americano.getName()+"입니다");
	  }
	
}
