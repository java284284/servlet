<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL=測試</title>
</head>
<body>
	<%!
	String myName = "Allen";
	Request.Attribute ("myName", myName);
	%>
	<div>嗨{myName}</div>

<%
ArrayList<String>	;
%>
<div>${myAl.get }</div>

</body>
</html>