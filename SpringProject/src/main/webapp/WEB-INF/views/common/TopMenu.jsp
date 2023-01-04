<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<%	request.setCharacterEncoding("UTF-8"); %>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<% /*
sticky-top은 상단 공간 차지하면서 위에 고정
fixted-top은 상단 공간 차지하지 않고 위에 고정
일부 내용은 상단 메뉴바에 가려져서 보이지 않을 수 있음  
*/ %>


<nav class= "navbar navbar-inverse navbar-sticky-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#Navbar" >
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
				<a class="navbar-brand" href="${contextPath }/main.do">Homepage</a>
		</div>
<!--  실질적인 메뉴 나열  --> 
	<div class="collapse navbar-collapse" id="myNavbar">
		<ul class="nav navbar-nav navbar-left">
			
<li>
<form class = "navbar-form navbar-left" method="post" action="${contextPath}/member/login.do" >
	<c:choose>
		<c:when text="${isLogOn == true && member != null}">
			<p class="navbar-text"><b>${member.name}님 즐거운 어쩌고....</b></p>
			<a href="${contextPath}/member/logout.do" class="btn btn-danger">
				<span class="glyphicon glyphicon-log-out></span> LOGOUT</a>
					
		</c:when>
	<c:oterwise>
		<div class="form-gruop">
			<input type="text" class="form-control" name="id" size="12" naxlength="20" placeholder="ID"/>
			<input type="password" class="form-control" name="pwd" size="12" naxlength="20" placeholder="비번"/>
	  	 </div>
			<button type= "submit" class="byn btn-iprimary"> 
				<span clawss="glyphicon glyphicon-log-in"></span>LOGIN
			 </button>
	 </c:otherwise>
												   
	 </c:choose>
</form>

</li>		
			
			
			
			<li class="dropdown">
				<a class="dropdown-toggle" data-toggle="dropdown" href="#">Basic<span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a href="${contextPath}/exam/exam1/doA" >doA</a></li>			
				<li><a href="${contextPath}/exam/exam1/doB" >doB</a></li>	
					<li role="presentation" class="divider"></li>		
				<li><a href="${contextPath}/exam/exam2/doC" >doC</a></li>		
				<li><a href="${contextPath}/exam/exam2/gugudanForm.do" >gugudan</a></li>
					<li role="presentation" class="divider"></li>		
				<li><a href="${contextPath}/exam/exam3/doD" >회원정보(객체)</a></li>		
				<li><a href="${contextPath}/exam/exam3/doE" >회원정보(Map)</a></li>		
			</ul>		
			</li>	
			
			<li class="dropdown">
				<a class="dropdown-toggle" data-toggle="dropdown" href="#">회원관리 <span class="caret"></span></a>
					<ul class="dropdown-menu">
			<li><a href="${contextPath}/member/loginForm.do">로그인</a></li>
					</ul>	
			</li>		
		</ul>
	</div>
	</div>
</nav>
