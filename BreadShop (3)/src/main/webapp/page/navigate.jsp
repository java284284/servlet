<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<header class="p-3 mb-3 border-bottom">
	<div class="container">
		<div
			class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
			<a href="/"
				class="d-flex align-items-center mb-2 mb-lg-0 text-dark text-decoration-none">
				<svg class="bi me-2" width="40" height="32" role="img"
					aria-label="Bootstrap">
						<use xlink:href="#bootstrap"></use></svg>
			</a>

			<!-- 導覽選項 -->
			<ul
				class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
				<li><a href="${pageContext.request.contextPath}"
					class="nav-link px-2 link-secondary">線上麵包商店</a></li>
				<li><a
					href="${pageContext.request.contextPath}/GetAllProduct.do"
					class="nav-link px-2 link-dark">商品頁面</a></li>
				<li><a
					href="${pageContext.request.contextPath}/page/shoppingCart.jsp"
					class="nav-link px-2 link-dark">購物車</a></li>
				<li><a href="${pageContext.request.contextPath}/page/admin.jsp"
					class="nav-link px-2 link-dark">後台管理</a></li>
				<li><a
					href="${pageContext.request.contextPath}/page/addProduct.jsp"
					class="nav-link px-2 link-dark">新增商品</a></li>

			</ul>
			<!-- 導覽選項 -->

			<!-- 會員登入/登入成功圖案 -->
			<div class="dropdown text-end">

				<c:if test="${empty users}">
					<a href="${pageContext.request.contextPath}/page/login.jsp">
						<button class="btn btn-primary">會員登入</button>
					</a>
				</c:if>

				<c:if test="${!empty users}">
					<a href="#"
						class="d-block link-dark text-decoration-none dropdown-toggle"
						id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
						<img src="data:image/jpeg;base64,${users.photoBase64 }" width="45" height="45" class="rounded-circle">
						<span>${users.name }</span>

					</a>
					<ul class="dropdown-menu text-small"
						aria-labelledby="dropdownUser1">
						<li><a class="dropdown-item" href="#">會員資訊(建置中)</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="/BreadShop/Logout.do">登出</a></li>
					</ul>
				</c:if>
			</div>
			<!-- 會員登入/登入成功圖案 -->

		</div>
	</div>
</header>