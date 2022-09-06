<%@page import="tw.com.eeit.bean.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>條件判斷</title>
</head>
<body>

	<%
	Users u = new Users();
	u.setName("Jim");
	u.setAge(18);

	request.setAttribute("loginUser", u);
	%>


	<c:if test="${loginUser.age>=18 }">
		<div>歡迎登入!${loginUser.name }</div>
	</c:if>

	<c:if test="${loginUser.age<18 }">
		<div>此頁必須滿18歲才可觀看!</div>
	</c:if>

	<!-- 如果想寫出if else的話，請使用以下兩個標籤做組合 -->
	<c:choose></c:choose>
	<c:otherwise></c:otherwise>


</body>
</html>