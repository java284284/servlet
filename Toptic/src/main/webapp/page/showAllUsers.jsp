<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顯示所有使用者</title>

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

	<div class="container">
		<div style="color: red">${message }</div>

		<table class="table">
			<thead>
				<tr>
					<td>id</td>
					<td>account</td>
					<td>password</td>
					<td>name</td>
					<td>img</td>
					<td>修改</td>
					<td>刪除</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allUsers}" var="user">
					<tr>
						<td>${user.id }</td>
						<td>${user.account }</td>
						<td>${user.password }</td>
						<td>${user.name }</td>
						<td>${user.img }</td>
						<td>
							<button class="btn btn-primary">修改</button>
						</td>
						<td><a
							href="${pageContext.request.contextPath}/DeleteUser.do?userID=${user.id }">
								<button class="btn btn-danger">刪除</button>
						</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>