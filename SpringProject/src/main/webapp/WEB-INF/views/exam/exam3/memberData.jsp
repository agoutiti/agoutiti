<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 상단 메뉴바 -->

	<jsp:include page="../../common/TopMenu.jsp" flush="false"/>

<div class="container">
	
	<h4>  Member Information</h4>
	<h4>MemberVO</h4>
	<h4>MemberVO ID : ${member.userId } </h4>
	<h4>MemberVO PW : ${member.userPw }</h4>
	<hr/>
	<h4>  Member Information(Map)</h4>
	<h4>Map</h4>
	<h4>Map ID : ${map.userId } </h4>
	<h4>Map PW : ${map.userPw }</h4>
	<h4></h4> 
</div>	

</body>
</html>
