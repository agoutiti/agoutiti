package com.edu.exam.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam/exam1") // url주소를 포트번호/exam/exam1로 요청되는 것을 처리한다  
public class ExamController01 {

	
	
	@RequestMapping("/doB")
		public void doB() { //메서드 내용 실행한 후 리턴=>/WEB-INF/views/exam/exam1/doB.jsp 
			System.out.println("doB 실행");
	}
	@RequestMapping("/doA")
		public void doA() { 
			System.out.println("doA 실행");
//			메소드 실행되면 return doA로 가는게 아니고 RequestMapping doA로 가서 실행됨
			
//			void 타입인 메소드면 return 타입 없는 경우. 
//			servlet-context.xml은 prefix+리퀘스트매핑+suffix
//			=> return => /WEB-INF/views/exam/exam1/doA.jsp 순으로 실행됨	
	}
	
}
