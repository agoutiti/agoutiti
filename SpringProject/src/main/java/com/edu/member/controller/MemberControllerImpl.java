package com.edu.member.controller;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edu.member.MemberDTO;
import com.edu.member.service.MemberService;


@Controller("memberController")
@RequestMapping("/member") // url에서 /member로 시작하는 요청들을 처리하는 컨트롤러 
public class MemberControllerImpl implements MemberController {

	private static final Logger logger 	= LoggerFactory.getLogger(MemberControllerImpl.class);
	
	
// @Inject   : java에서 지원하는 어노테이션. 특정 Framework에 종속적이지 않음. 유연하고 수용을 잘해주는 특성. 
@Autowired //: Spring에서 지원하는 어노테이션. 
private MemberDTO memberDTO;

@Autowired
private MemberService memberService;

// 로그인 화면 띄우기

@Override 
@RequestMapping(value="/loginForm.do", method=RequestMethod.POST)
public ModelAndView login(@ModelAttribute("memberDTO") MemberDTO memberDTO,
		RedirectAttributes ReAttr, 
		HttpServletRequest request, 
		HttpServletResponse response) throws Exception {

	logger.info(("MemberControllerImpl 로그인 처리 시작.."));
	System.out.println("로그인 정보"+ "+memberDTO.getId()"+"memberDTO.getPwd()" );

	
	ModelAndView mav = new ModelAndView();
		if(memberDTO.getId().equals("") || memberDTO.getId() == null) {
			ReAttr.addAttribute("result", "loginIdEmpty") ;// 아이디 값이 없이 넘어오면 돌려보낸다
			mav.setViewName("redirect:/member/loginForm.do");
			return mav;	
		}
		// 로그인한 정보를 가지고 데이터베이스에 존재하는지 처리하고 그 결과를 가져온다
		memberDTO = memberService.login(memberDTO);
		System.out.println("로그인 처리 결과: "+memberDTO);
		return mav;
	}




}
// MemberController-Impl, impl,