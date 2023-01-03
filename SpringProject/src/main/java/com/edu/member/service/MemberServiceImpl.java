package com.edu.member.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.edu.member.MemberDTO;
import com.edu.member.MemberDAO.MemberDAO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	private static final Logger logger 
	 = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Autowired 
	private MemberDAO memberDAO;
	
	@Override
	public MemberDTO login(MemberDTO memberDTO) throws DataAccessException {
		logger.info("MemberServiceImpl login() 시작");
		return memberDAO.loginByID(memberDTO);
	}

}
