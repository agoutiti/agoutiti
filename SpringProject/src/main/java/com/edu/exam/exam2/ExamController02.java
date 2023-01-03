package com.edu.exam.exam2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/exam/exam2")
public class ExamController02{
	
	// return 타입이 string인 경우
	//ModelAttribute("msg")는 주소창에서 msg라는 파라미터 값 가져온다
	// localhost:8090/exam/exam2/doC?msg=hello
	//이렇게 주소창에 파라미터 적혀있는 경우 ㅔ자동적으로 msg 값인 hello 가져옴
	//=> request.getParametmer("msg"를 사용하지 않아도 됨)
	
    @RequestMapping("/doC")   
    public String doC(@ModelAttribute("msg") String msg) {
			System.out.println("doC실행 msg =>"+ msg);
			
			// return에 문자열 사용될 경우 리턴되는 문자열jsp 파일을 찾아서 실행함
			// /WEB-INF/views/+"exam/exam2/doC"+jsp 
			//void타입과 다르게 return 타입이 String인 경우 리턴하는 문자열의 VIew의 이름이 된다 
    	return "exam/exam2/doC";    
    }
    
   // @RequestMapping("/gugudanForm.do")
   // return 타입이 void면 value값이 page 이름이 된다 
    @RequestMapping(value = "gugudanForm.do", method = RequestMethod.GET)
    public void gugudanForm() {
    		System.out.println("구구단을 외자~");
    }
    
//  @RequestMapping("gugudanForm.do")는 get,post 방식과 상관없음?
    @RequestMapping (value="gugudan.do", method=RequestMethod.GET)
//    public String gugudan(int dan, Model model) {
	
	public String gugudan(@RequestParam(defaultValue="3") int dan, Model model, String msg) {
    	System.out.println("구구단 결과는...");
    	
//    	get방식으로는 일케 됏겟지만..
//    	<a href = "http://localhost:8090/exam/exam2/gugu.do?dan=3"> 구구단 </a>
//    	public String gugu(HttpServletRequest request, Model model)
//    	int dan = Integer.parseInt(request.getParameter("dan"));
//    	스프링에서는 get방식처럼 사용하지 않음.
//    	public String gugu (int dan, Model model)로 씀. 스프링은 알아서 잡아줌. 
    		
    		
//    	값을 넘겨주는 페이지에서 String으로 값이 넘어오지만 Spring에서는 정수형으로 잘 받아짐
//    	이게 스프링의 장점. string integer 이런거 안해도 된다고..dan..
    	System.out.println(" 계산:  "+dan+"단이고,"+"전송받은 문자열은 "+ msg);
    	
    		String result = "";
    		for(int i =1; i<=9; i++) {
    			result += "<h4>" + dan + "x"+i+"="+dan*i+"</h4>";
			}
    	model.addAttribute("result", result);
	
    	return "exam/exam2/gugudan";
		
	}
}