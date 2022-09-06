<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>設定與刪除</title>
</head>
<body>

	<c:set var="myName" value="Allen" />
	<c:set var="myAge" value="${10*2+5-3}" />

	<c:remove var="myName" />

	<div>我的姓名是：${myName }</div>
	<div>我的年齡是：${myAge }</div>

	<div>
		我的姓名是：
		<c:out value="${myName}" default="他沒寫!" />
	</div>
	<div>
		我的年齡是：
		<c:out value="${myAge}" default="他沒寫!" />
	</div>

</body>
</html>