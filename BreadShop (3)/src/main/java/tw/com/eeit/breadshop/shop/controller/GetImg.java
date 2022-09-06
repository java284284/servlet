package tw.com.eeit.breadshop.shop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.breadshop.shop.service.ShopService;

@WebServlet("/GetImg.do")
public class GetImg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String imgName = request.getParameter("name");
		ShopService shopService = new ShopService();
		
		byte[] bytes = shopService.getImgByName(imgName);

		response.setContentType(getServletContext().getMimeType(imgName));
		
		ServletOutputStream out = response.getOutputStream();
		out.write(bytes);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
