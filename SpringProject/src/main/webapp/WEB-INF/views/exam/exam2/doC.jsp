<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>doC.jsp</title>
</head>
<body>
<!-- 상단 메뉴바 -->

	<jsp:include page="../../common/TopMenu.jsp" flush="false"/>

	<p>doC.jsp 실행화면</p>
	<p>ModelAttribute에 담긴 메시지 받기</p>
	<p>Message : ${msg }</p>
	<p></p>

</body>
</html>
