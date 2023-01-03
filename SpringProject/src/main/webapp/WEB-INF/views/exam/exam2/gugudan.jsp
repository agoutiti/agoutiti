<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%	request.setCharacterEncoding("UTF-8"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GuGudan</title>
</head>
<body>

<!-- 상단 메뉴바 -->

	<jsp:include page="../../common/TopMenu.jsp" flush="false"/>
	
	<div class= "container">
		<h4 align = "center" > 구구단 결과 </h4>
		<h4>$ {result }</h4>
		<h4></h4>
	</div>

</body>
</html>