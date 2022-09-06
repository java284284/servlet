package tw.com.eeit.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie1")
public class cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		Cookie c = new Cookie("myName", "cookie");
		c.setMaxAge(60*60*24*7);
		response.addCookie(c);
		
		Cookie c2 = new Cookie("myName", "cookie");
		c.setMaxAge(60*60*24*7);
		c.setHttpOnly(true);
		response.addCookie(c2);
		
		response.getWriter().write("cookieTest");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
