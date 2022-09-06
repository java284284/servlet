package tw.com.eeit.breadshop.shop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import tw.com.eeit.breadshop.shop.model.bean.Products;
import tw.com.eeit.breadshop.shop.service.ShopService;

@WebServlet("/AddProduct.do")
@MultipartConfig
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String pName = request.getParameter("productName");
		int pPrice = Integer.parseInt(request.getParameter("productPrice"));
		Part pPart = request.getPart("productImg");

		Products p = new Products();
		p.setName(pName);
		p.setPrice(pPrice);
		p.setImg(pPart.getInputStream().readAllBytes());

		ShopService shopService = new ShopService();
		String message = shopService.addProdcut(p);

		request.setAttribute("message", message);
		request.getRequestDispatcher("page/addProduct.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
