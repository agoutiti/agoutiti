package com.edu.member.MemberDAO;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.edu.member.MemberDTO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {

	
@Autowired
private SqlSession sqlSession;

 	private static final Logger logger 
	= LoggerFactory.getLogger(MemberDAOImpl.class);
	
	private	static final String Namespace = "com.edu.member";
	 
	
	@Override
	public MemberDTO loginByID(MemberDTO memberDTO) throws DataAccessException {
		MemberDTO memDTO = sqlSession.selectOne(Namespace + ".loginByID", memberDTO);
		return memDTO;
	}

}

