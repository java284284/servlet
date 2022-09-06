<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重新導向標籤</title>
</head>
<body>



	<c:redirect url="DoSome.do">
		<c:param name="myPet" value="dog" />
	</c:redirect>



</body>

</html>