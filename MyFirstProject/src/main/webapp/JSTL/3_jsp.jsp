<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
	Users u = new Users();
	u.setName("Jim");
	u.setAge(18);

	request.setAttribute("loginUser", u);
	%>

	<c:if test="${​u.age>18 }​">
		<div>歡迎登入!${​u.name }​</div>
	</c:if>
	<c:if test="${​u.age<=18 }​">
		<div>此頁必須滿18歲才可觀看!</div>
	</c:if>


</body>
</html>