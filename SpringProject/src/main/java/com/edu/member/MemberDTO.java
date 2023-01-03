package com.edu.member;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("memberDTO") 
//component 어노테이션 활용하면 Bean Configuration 파일에 Bean으로 따로 등록하지 않아도 사용할수 있음.
//component 어노테이션은 기본적으로 타입 기반의 자동 주입 어노테이션.

public class MemberDTO { // 회원 정보 클래스 

	private String id; // 유저(사용자) ID
		public String getId() {return id;}
		public void setId(String id) {this.id = id;}
	
	private String pwd;
		public String getPwd() {return pwd;	}
		public void setPwd(String pwd) {this.pwd = pwd;}
		
	private String name;
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}
	
	private String email;
		public String getEmail() {return email;}
		public void setEmail(String email) {this.email=email ;	}
	
	
	private Date   joinDate;
		public Date getJoinDate() {	return joinDate;}
		public void setJoinDate(Date joinDate) {this.joinDate = joinDate;}
		
	
		public MemberDTO() {
			// 기본 생성자, 프라이빗한 개인정보 말고 퍼블릭하게 가져올 정보 담을.. 
			}
		public MemberDTO(String id, String pwd, String name, String email) {
			this.id    =id;
			this.pwd   =pwd;
			this.name  =name;
			this.email =email;
			}


	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", joinDate=" + joinDate
				+ "]";
	}

}
