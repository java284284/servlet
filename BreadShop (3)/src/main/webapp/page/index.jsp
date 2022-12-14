<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>線上麵包商店</title>

<!-- web icon -->
<link rel="icon"
	href="${pageContext.request.contextPath}/img/favicon.ico">

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

<!-- 自定義CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/index.css">


</head>

<body>
	
	<jsp:include page="navigate.jsp" />

	<main>
		<div
			class=" position-relative overflow-hidden p-3 p-md-5 m-md-3 text-center backgroundImg ">
			<div class="col-md-5 p-lg-5 mx-auto my-5">
				<h1 class="display-4 fw-normal text-light">麵包商店</h1>
				<p class="lead fw-normal text-light">好吃的麵包在哪裡</p>
				<a class="btn btn-warning"
					href="${pageContext.request.contextPath}/page/shop.jsp">在這裡</a>
			</div>
			<div class="product-device shadow-sm d-none d-md-block"></div>
			<div
				class="product-device product-device-2 shadow-sm d-none d-md-block"></div>
		</div>
	</main>

	<jsp:include page="footer.jsp" />
	
</body>
</html>