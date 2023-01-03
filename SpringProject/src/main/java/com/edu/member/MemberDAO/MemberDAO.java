package com.edu.member.MemberDAO;

import org.springframework.dao.DataAccessException;

import com.edu.member.MemberDTO;

public interface MemberDAO {
	public MemberDTO loginByID(MemberDTO memberDTO)
			throws DataAccessException;
	
	


	
}
