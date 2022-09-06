<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>線上麵包商店</title>

<!-- web icon -->
<link rel="icon" href="/BreadShop/assets/favicon.ico">

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

<!-- jQuery 3.6.0 -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>

<!-- 自定義CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/shop.css">

</head>

<body>
	<jsp:include page="navigate.jsp" />

	<main>
		<!-- 輪播圖片 -->
		<section class="py-5 text-center container">
			<div id="carouselExampleIndicators" class="carousel slide"
				data-bs-ride="carousel">
				<div class="carousel-indicators">
					<button type="button" data-bs-target="#carouselExampleIndicators"
						data-bs-slide-to="0" class="active" aria-current="true"
						aria-label="Slide 1"></button>
					<button type="button" data-bs-target="#carouselExampleIndicators"
						data-bs-slide-to="1" aria-label="Slide 2"></button>
					<button type="button" data-bs-target="#carouselExampleIndicators"
						data-bs-slide-to="2" aria-label="Slide 3"></button>
				</div>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="${pageContext.request.contextPath}/img/ad01.jpg"
							class="d-block w-100 ">
					</div>
					<div class="carousel-item">
						<img src="${pageContext.request.contextPath}/img/ad02.jpg"
							class="d-block w-100 ">
					</div>
					<div class="carousel-item">
						<img src="${pageContext.request.contextPath}/img/ad03.jpg"
							class="d-block w-100 ">
					</div>
				</div>
				<button class="carousel-control-prev" type="button"
					data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Previous</span>
				</button>
				<button class="carousel-control-next" type="button"
					data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Next</span>
				</button>
			</div>
		</section>
		<!-- 輪播圖片 -->

		<div class="album py-5 bg-light">
			<div class="container">
				<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">

					<!-- 重複的結構 -->
					<c:forEach items="${allProducts }" var="p">
						<div class="col">
							<div class="card">
								<img src="${pageContext.request.contextPath}/GetImg.do?name=${p.name}" class="card-img-top">
								<div class="card-body text-center fs-4">${p.name }</div>
								<div class="card-footer text-end">
									<span class="me-5">$${p.price }</span>
									<button class="btn btn-primary add" productId="${p.id }">加入購物車</button>
								</div>
							</div>
						</div>
					</c:forEach>
					<!-- 重複的結構 -->

				</div>
			</div>
		</div>
	</main>

	<jsp:include page="footer.jsp" />

</body>

</html>