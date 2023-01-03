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
 = LoggerFactory.getLogger(MemberDAOImpl.class) ;
	
	
	@Override
	public MemberDTO loginByID(MemberDTO memberDTO) throws DataAccessException {
		
		return null;
	}

}


<mapper namespalce - com.edu.member>
<resultMap id="memberResult" type="com.edu.member.dto.MemberDTO">
	<result property="id" column="id"/>
	<result property="pwd" column="pwd"/>
	<result property="id" column="name"/>
	<result property="id" column="email"/>
	<result property="id" column="joinDate"/>

</resultMap>

<selelct id="loginByID" parameterType="">
</mapper>