<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out</title>
</head>
<body>
	<%
	String myName = "allen";
	request.setAttribute("myName", myName);
	%>
	<div>
		<c:out value="${myName2 }" default="NULL"></c:out>
	</div>
	<div>
		<c:out value="${myName2 }" default="NULL"></c:out>
	</div>
	
</body>
</html>