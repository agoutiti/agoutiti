package com.edu.member.service;

import org.springframework.dao.DataAccessException;

import com.edu.member.MemberDTO;

public interface MemberService {
	// 회원정보 서비스
	
	public MemberDTO login(MemberDTO memberDTO ) 
		throws DataAccessException;
		// 로그인 처리 	

}
