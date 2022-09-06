<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String myName = "Allen";
	request.setAttribute("myName", myName);
	new ArrayList<String>();
	%>

	<%!int myAge = 18;%>

	<div>
		你的名字是：<%=myName%>
	</div>
	<div>
		你的年齡是：<%=myAge%>
	</div>


</body>
</html>