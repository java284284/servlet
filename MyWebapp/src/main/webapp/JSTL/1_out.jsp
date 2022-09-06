<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out標籤</title>
</head>
<body>
	<%
	String myName = "Allen";
	request.setAttribute("myName", myName);
	%>

	<div>
		<c:out value="${myName }" default="此值為空!" />
	</div>
	<div>
		<c:out value="${myName2 }" default="此值為空!" />
	</div>



</body>
</html>