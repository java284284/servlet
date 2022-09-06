package tw.com.eeit.context.test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AServlet.do")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		ServletContext context = getServletContext();

		ArrayList<String> aL = new ArrayList<String>();
		aL.add("car");
		aL.add("腳踏車");
		aL.add("water");
		context.setAttribute("myProductList", aL);
		response.getWriter().write("這邊是A<br>");
		response.getWriter().write("初始顏色參數值：" + context.getInitParameter("color"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
