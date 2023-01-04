package com.edu.member.controller;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

	private static final Logger logger 
			= LoggerFactory.getLogger(MemberControllerImpl.class);
	
// @Inject   : java에서 지원하는 어노테이션. 특정 Framework에 종속적이지 않음. 유연하고 수용을 잘해주는 특성. 
@Autowired //: Spring에서 지원하는 어노테이션. 
private MemberDTO memberDTO;

@Autowired
private MemberService memberService;


//member 로그인 창에서 보내온 정보 
//memberDTO DB에서 가져온 정보 

//로그인 화면 띄우기
@Override
@RequestMapping(value="/loginForm.do", method=RequestMethod.GET)
public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) 
	throws Exception {

	ModelAndView mav = new ModelAndView();
	mav.setViewName("/member/loginForm");
	return mav;
	}

//로그인 처리
@Override
@RequestMapping(value="/login.do", method=RequestMethod.POST)
public ModelAndView login(@ModelAttribute("memberDTO") MemberDTO member,
		RedirectAttributes ReAttr, 
		HttpServletRequest request, 
		HttpServletResponse response) throws Exception {

	logger.info("MemberControllerImpl 로그인 처리 시작.....");
		System.out.println("로그인 정보 => " + member.getId() + " : " + member.getPwd());
	
	ModelAndView mav = new ModelAndView();
	
	if(member.getId().equals("") || member.getId() == null) {
		ReAttr.addAttribute("result", "loginIdEmpty") ;// 아이디 값이 없이 넘어오면 돌려보낸다
		mav.setViewName("redirect:/member/loginForm.do");
		return mav;	
	}
	// 로그인한 정보를 가지고 데이터베이스에 존재하는지 처리하고 그 결과를 가져온다
	memberDTO = memberService.login(member);
		System.out.println("로그인 처리 결과: "+memberDTO);
	
// 로그인한 정보 가지고 데이터베이스에 존재하는지 처리하고 그 결과를 가져온다
//member 로그인 창에서 보내온 정보 
//memberDTO DB에서 가져온 정보 

memberDTO = memberService.login(member); 
	System.out.println("로그인 처리 결과" + memberDTO);
// 로그인 한 정보가 데이터베이스에 존재하는지에 따라 처리를 다르게 한다
if(memberDTO != null) { // 로그인 정보에 해당하는 자료가 있으면
	if(member.getPwd().equals (member.getPwd())) {
		
		// 아이디와 비번 일치하면 세션 발급 
		HttpSession session = request.getSession();
		session.setAttribute("member", memberDTO);
		session.setAttribute("isLogOn", true);
		mav.setViewName("redirect:/main.do"); // 메인 화면으로 이동 
	}else { // 아이디는 있는데 비번이 틀린 경우 
		// 메시지를 가지고 로그인 화면으로 이동
		ReAttr.addAttribute("result", "PasswordFailed");
		mav.setViewName("redirect:/member/loginForm.do");
		} 
	}else { // 로그인한 아이디가 존재하지 않으면
		// 로그인 실패 메시지 가지고 로그인 화면으로 이동
		ReAttr.addAttribute("result", "loginFailed");
		mav.setViewName("redirect:/member/loginForm.do");
	}
	return mav;
	}



@Override	
@RequestMapping(value="/logout.do", method=RequestMethod.GET)
public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) 
	throws Exception {
		// 로그아웃 버튼 누르면 session 정보 없애고 메인페이지로 이동하게 만들기
		HttpSession session = request.getSession();
		session.removeAttribute("member");
		session.removeAttribute("isLogOn");
	
	ModelAndView mav = new ModelAndView();
	mav.setViewName("redirect:/main.do"); // 메인 페이지로 이동
	
	return mav;


}
// MemberController-Impl, impl,
