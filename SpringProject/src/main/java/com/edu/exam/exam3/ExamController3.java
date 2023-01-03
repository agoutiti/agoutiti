package com.edu.exam.exam3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam/exam3")
public class ExamController3 {
	
	@RequestMapping("/doD")
	public String doD (Model model) {
		System.out.println("doD 시작");
			MemberVO memberVO = new MemberVO ();
			memberVO.setUserId("userID-001");
			memberVO.setUserPw("userPW-001");
		
			model.addAttribute("member", memberVO);
			
		return "/exam/exam3/memberData";
	}

	@RequestMapping("/doE")
	public String doE (Model model) {	
		System.out.println("doE 실행");
//			Map map = new HashMap();
			Map<String, String> map = new HashMap<String, String>();
			map.put("useid", "mapID-002");
			map.put("usepw", "mapPW-002");
			
			model.addAttribute("map", map);
			
			
		return "/exam/exam3/memberData";
	}
}






