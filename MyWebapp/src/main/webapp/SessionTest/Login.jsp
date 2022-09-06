<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入頁面</title>
</head>
<body>

	<form action="Login.do" method="post">
		<div>
			帳號：<input type="text" name="account">
		</div>
		<div>
			密碼：<input type="text" name="password">
		</div>
		<div>
			記住我： <input type="checkbox" name="remeberMe">
		</div>

		<button>登入</button>
	</form>


</body>
</html>