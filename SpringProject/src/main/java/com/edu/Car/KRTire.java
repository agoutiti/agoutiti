package com.edu.Car;

public class KRTire implements Tire {
// 인터페이스를 이용하는 클래스는 인터페이스에 있는 모든 추상메서드 구현해야함
	@Override
	public String getBrand() {
		return "KR Tire";
	}

// 4번째 예제: XML파일읠 이용하여 스프링을 통한 의존성 주입
// 스프링 도입해서 얻는 이점은? 자동차의 타이어 브랜드 변경할 때
// 재컴파일/재배포 안해도 XML 파일만 수정하면 프로그램 실행결과를 바꿀 수 있음 
	
	
// 6번째 예제: 스프링을 이용한 @Autowired를 통해서 속성(의존성) 주입.
	
}
