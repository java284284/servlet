<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>產生「URL文字」的標籤</title>
</head>
<body>

	<c:url value="DoSome.do" var="myURL">
		<c:param name="myPet" value="dog" />
	</c:url>

	${myURL}



</body>
</html>