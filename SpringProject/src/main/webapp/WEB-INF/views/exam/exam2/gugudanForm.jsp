<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%	request.setCharacterEncoding("UTF-8"); %>
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
			<form class = "form-horizontal" method="get" action="${contextPath }/exam/exam2/gugudanForm.do">
				
				<div class= "form-group">
					<div class="col-sm=offset-3 col-sm-3">
						<h4 align = "left">GuGuDan</h4>
					</div>
				</div>
				
				<div class="form-group">
					<label class = "col-sm-offset-2 col-sm-2 control-label">단 입력</label>
					<div class="col-sm-2">
						<input type="text" class="form-control" id="dan" name="dan" maxlenth="2" placeholder="단 입력"/> 
						<!--넘어가는 변수는 name. id아님-->
						<input type="hidden" class="form-control" name="msg" value="HELLO??"/>
					</div>
				</div>
					
				<div class="form-group">
					<div class = "col-sm-offset-3 col-sm-4">
						<button type="reset"  class="btn btn-warning"> Reset </button>
						<button type="submit" class="btn btn-primary"> Submit</button>
						
					</div>
				</div>
			</form>
		</div>
	

</body>
</html>