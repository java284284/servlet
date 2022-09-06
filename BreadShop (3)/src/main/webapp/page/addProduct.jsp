<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增商品</title>

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

</head>
<body>
	<jsp:include page="navigate.jsp" />

	<div style="color:red">${message }</div>

	<div class="m-5">
		<form action="${pageContext.request.contextPath}/AddProduct.do" method="POST"
			enctype="multipart/form-data">
			<div>
				商品名稱： <input type="text" name="productName">
			</div>
			<div>
				商品價格： <input type="number" name="productPrice">
			</div>
			<div>
				商品圖片： <input type="file" name="productImg">
			</div>

			<button>新增</button>
		</form>
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>