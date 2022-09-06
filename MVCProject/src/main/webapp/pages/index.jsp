<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首頁</title>

<!-- Boostrap v5.1.1 css -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">

<!-- Boostrap v5.1.1 js with popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
	crossorigin="anonymous"></script>

</head>
<body>
	<h2 class="m-3">請選擇功能</h2>
	<div>
		<button id="loginBTN" class="btn btn-primary m-3">登入</button>
	</div>
	<div>
		<button id="searchUsersBTN" class="btn btn-warning m-3">查詢使用者</button>
	</div>
	<div>
		<a href="${pageContext.request.contextPath}/pages/addUser.jsp">
			<button id="addUsersBTN" class="btn btn-warning m-3">新增使用者</button>
		</a>
	</div>
</body>


<script type="text/javascript">
	const loginBTN = document.getElementById("loginBTN");
	const searchUsersBTN = document.querySelector("#searchUsersBTN");

	loginBTN.addEventListener("click", function() {
		location.href = "${pageContext.request.contextPath}/pages/login.jsp";
	})

	searchUsersBTN.addEventListener("click", function() {
		console.log("AAA")
		location.href = "${pageContext.request.contextPath}/showAllUsers.do";
	})
</script>


</html>