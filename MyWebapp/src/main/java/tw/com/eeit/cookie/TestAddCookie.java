package tw.com.eeit.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestFolder/TestAddCookie.do")
public class TestAddCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		Cookie c = new Cookie("myName", "Allen");
		c.setMaxAge(60 * 60 * 24 * 7);
		response.addCookie(c);

		Cookie c2 = new Cookie("myAge", "18");
		c2.setMaxAge(60 * 60 * 24 * 7);
		c2.setHttpOnly(true);
		response.addCookie(c2);

		response.getWriter().write("已經建立起cookie");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
