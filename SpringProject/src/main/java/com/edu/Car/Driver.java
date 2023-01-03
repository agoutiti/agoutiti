package com.edu.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
//		Car car = new Car();
//			System.out.println(car.getTireBrand());
//	}
	
//	Tire tireKR = new KRTire(); // 운전자가 타이어를 생산한다
//	Tire tireUS = new USTire(); 
//	Tire tireEU = new EUTire(); 
//	car car = new car(); //운전자가 자동차 생산하면서 타이어를 장착하는.
//	
//	car.setTire(tireUS); // 속성을 통해서 의존성 주입. Car.java 에서 getter, setter 설정
//		System.out.println(car.getTireBrand());
//		}

//	ApplicationContext ctx1 +
//		= new GenericXmlApplicationContext("com/edu/Car/applicationContext.xml");
	
//	ApplicationContext ctx2 // 일케 써도 됨  
//			= new FileSystemXmlApplicationContext("src/main/java/com/edu/Car/applicationContext.xml");
	
	
// 6번쨰 예제: 스프링 설정 파일을 읽어들인다 => 컨테이너 구성됨
//		    컨테이너 구성 = > 설정 파일에서 <bean>으로 지정한 것이 Bean으로 등록됨		
		ApplicationContext ctx // 일케 써도 됨2  
			= new ClassPathXmlApplicationContext("com/edu/Car/applicationContext.xml");
//	<bean id="tire" class="com.edu.Car.car/KoreTire"/>
//  KoreaTire tire =new KoreaTire();		
		
	Car car = ctx.getBean("car", Car.class); // 사용할 bean을 가져온다
//	Tire tire = ctx.getBean("tire", Tire.class); // 제대로 물건이 왓는지 확인 
//	
//	car.setTire(tire);
		System.out.println(car.getTireBrand());
		
		
	
	}
}
