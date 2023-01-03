package com.edu.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edu.member.MemberDTO;

public interface MemberController {


	
public ModelAndView loginForm (HttpServletRequest req, HttpServletResponse res)  //로그인 폼
	
public ModelAndView login (@ModelAttribute("memberDTO") 
				MemberDTO memberDTO, //로그인 처리
				RedirectAttributes ReAttr, 
				HttpServletRequest request, 
				HttpServletResponse response) throws Exception; // 로그인 처리
		
//		스프링이 좋은게 memberDTO 만들어둿는데......
	
	
}
