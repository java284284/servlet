<%@page import="tw.com.eeit.bean.Users"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL測試</title>
</head>
<body>
	<div>【String】</div>

	<%
	String myName = "Allen";
	request.setAttribute("myName", myName);
	%>
	<div>嗨!${myName}</div>

	<div>【ArrayList】</div>

	<%
	ArrayList<String> aL = new ArrayList<String>();
	aL.add("car");
	aL.add("水");
	aL.add("apple");
	request.setAttribute("myAL", aL);
	%>
	<div>${myAL.get(0)}</div>
	<div>${myAL[1] }</div>

	<div>【HashMap】</div>

	<%
	HashMap<String, String> hM = new HashMap<String, String>();
	hM.put("user", "Amy");
	hM.put("age", "18");
	hM.put("hobby", "slepp");
	request.setAttribute("myHM", hM);
	%>
	<div>我的名字：${myHM.get("user")}</div>
	<div>我的年齡：${myHM.age }</div>

	<div>【JavaBean】</div>
	<%
	Users u = new Users("Bob", 20, "music");
	request.setAttribute("myU", u);
	%>
	<div>我的名字：${myU.getName()}</div>
	<div>我的年齡：${myU.age }</div>

	<div>【pageContext.request.contextPath】</div>
	<div>路徑是什麼? ${pageContext.request.contextPath }</div>





</body>
</html>