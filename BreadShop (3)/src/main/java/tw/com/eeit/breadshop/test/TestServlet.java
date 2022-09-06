package tw.com.eeit.breadshop.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.breadshop.conn.ConnectionFactory;
import tw.com.eeit.breadshop.shop.model.bean.Products;
import tw.com.eeit.breadshop.shop.model.dao.ProductsDAO;

@WebServlet("/TestServlet.do")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();

		
		String mimeType = context.getMimeType("C:\\temp\\ProductPhoto\\5度C熟成吐司.jpeg");
		
		System.out.println(mimeType);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
