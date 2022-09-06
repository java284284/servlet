package tw.com.eeit.session;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.eeit.bean.Users;

@WebServlet("/SessionTest/Login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String remeberMe = request.getParameter("remeberMe");

		if (account.equals("AAA") && password.equals("123")) {
			Users users = new Users();
			users.setName("小明");

//			request.setAttribute("u", users);
			HttpSession session = request.getSession();
			session.setAttribute("u", users);

			if ("on".equals(remeberMe)) {
				session.setMaxInactiveInterval(60 * 60 * 24 * 7);

				Cookie c = new Cookie("JSESSIONID", session.getId());
				c.setMaxAge(60 * 60 * 24 * 7);

				c.setPath(getServletContext().getContextPath());

				response.addCookie(c);
			}
		}
		request.getRequestDispatcher("Welcome.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
