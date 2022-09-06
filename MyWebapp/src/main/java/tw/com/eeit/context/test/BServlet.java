package tw.com.eeit.context.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BServlet.do")
public class BServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();

		ServletContext context = getServletContext();

		ArrayList<String> aL = (ArrayList) context.getAttribute("myProductList");

		out.write("這邊是B<br>");
		out.write("我的購物清單：");

		for (int i = 0; i < aL.size(); i++) {
			out.write("<div>" + aL.get(i));
		}

		out.write("////");

		for (String item : aL) {
			out.write("<div>" + item);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
