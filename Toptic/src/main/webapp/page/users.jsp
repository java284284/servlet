<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>帳號管理中心</title>



<!-- 自定義CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/shop.css">
<!-- bootstrap 5.1.3 CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<!-- bootstrap 5.1.3 JS -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<body>
	<jsp:include page="navigate.jsp" />

<h2>帳號後台管理
</h2>
	<div style="color: red">${message }</div>
	<div></div>
	<c:forEach items="${allUsers }" var="p">
		<div>
			<img src="${pageContext.request.contextPath}/GetImg.do?id=${p.id}"
				class="">
			<div class="">姓名${p.name }</div>
			<span class="">帳號${p.account }</span> <span class="">密碼${p.password }</span>
			<button class="" name="${p.id }">資料</button>
			<a
				href="${pageContext.request.contextPath}/UpdateUsers.do?usersId=${p.id }">
				<button class="">修改</button>
			</a> <a
				href="${pageContext.request.contextPath}/DeleteUser.do?usersId=${p.id }">
				<button class="">刪除</button>
			</a>
		</div>


	</c:forEach>






	<jsp:include page="footer.jsp" />
</body>
</html>