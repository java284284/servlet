package tw.com.eeit.breadshop.shop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.breadshop.shop.model.bean.Products;
import tw.com.eeit.breadshop.shop.service.ShopService;

@WebServlet("/GetAllProduct.do")
public class GetAllProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Products> aL = new ShopService().getAllProducts();

		
		request.setAttribute("allProducts", aL);
		request.getRequestDispatcher("page/shop.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
