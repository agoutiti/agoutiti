package com.edu.member.MemberDAO;

import org.springframework.dao.DataAccessException;

import com.edu.member.MemberDTO;

public interface MemberDAO {
	public MemberDTO loginByID(MemberDTO memberDTO) throws DataAccessException;
	
	

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
	
	
	
}
