<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>迴圈</title>
</head>
<body>
	<%
	ArrayList<String> aL = new ArrayList<String>();
	aL.add("car");
	aL.add("水");
	aL.add("apple");
	request.setAttribute("myAL", aL);
	%>

	<div>我的購物清單</div>
	<c:forEach items="${myAL}" var="target" varStatus="varStatus">

		<div>${target }</div>
		<div>${varStatus.first }</div>

	</c:forEach>

	<div>下面是i++的寫法</div>

	<c:forEach begin="1" end="100" step="1" var="i">

		<div>${i }</div>

	</c:forEach>

</body>
</html>