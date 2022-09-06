package tw.com.eeit.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestGetCookies.do")
public class TestGetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		Cookie[] cs = request.getCookies();

		for (Cookie c : cs) {
			if (c.getName().equals("myName")) {
				response.getWriter().write("你的名字是：" + c.getValue());
			}

			if (c.getName().equals("myAge")) {
				response.getWriter().write("<div>你的年齡是：" + c.getValue());
			}

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
