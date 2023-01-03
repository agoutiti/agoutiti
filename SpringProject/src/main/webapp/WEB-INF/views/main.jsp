<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<%request.setCharacterEncoding("UTF-8"); %>    



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>

<jsp:include page="./common/TopMenu.jsp"></jsp:include> <!--  상단메뉴 --> 

<!--  메뉴바 하단에 페이지 소개르 보여줌 -->
<div class="container">
	<div class= "jumbotron">
		<div class="container text-center">
			<h4>YES24</h4>
				<p>방문 환영</p>			
		</div>
	</div>
</div>


<!--  화면 중앙에 이미지 보여주기 -->
<div class= "container">
	<div id="myCarousel" class= "carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class = "carousel-indicators">
			<li data-target= "#myCarousel" data-slide-to="0"></li>
			<li data-target= "#myCarousel" data-slide-to="1" class="active"></li>
			<li data-target= "#myCarousel" data-slide-to="2"></li>
		</ol>
		
		<!--  Wrapper for slides -->
		<div class="carousel-inner">
			<div class="item active">
		<!-- <img class="img-responsive center-block"   반응형 이미지를 가운데 정렬함 -->	
			<img class="img-responsive center-block"  	
				 src="${contextPath }/resources/images/books01.jpg"
				 width="80%" height="200px"/> 
		 <!--  carousel에 설명 보여주기 -->
		<div class="carousel-caption"> <!-- contextpath=webapp 말하는거-->
		<h4> 책방 이용 시설01</h4>
		</div>
		</div>
		
		<div class="item">
		<!-- <img class="img-responsive center-block"   반응형 이미지를 가운데 정렬함 -->	
			<img class="img-responsive center-block"  	
				 src="${contextPath }/resources/images/books02.jpg"
				 width="80%" height="200px"/> 
		 <!--  carousel에 설명 보여주기 -->
		<div class="carousel-caption"> <!-- contextpath=webapp 말하는거-->
		<h4> 책방 이용 시설02</h4>
		</div>
		</div>
		
			<div class="item">
		<!-- <img class="img-responsive center-block"   반응형 이미지를 가운데 정렬함 -->	
			<img class="img-responsive center-block"  	
				 src="${contextPath }/resources/images/books03.jpg"
				 width="80%" height="200px"/> 
		 <!--  carousel에 설명 보여주기 -->
		<div class="carousel-caption"> <!-- contextpath=webapp 말하는거-->
		<h4> 책방 이용 시설03</h4>
		</div>
		</div>
		</div>
<!--  좌측 우측으로 그림 울직일 수 있도록 좌.우 버튼 설정 -->		
		<a class="left carousel-control" href="#myCarousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevbron-left"></span>
			</a>
		<a class="right carousel-control" href="#myCarousel" data-slide="next">
			<span class="glyphicon glyphicon-chevbron-right"></span></a>
			
		</div>
	</div>

</body>
</html>