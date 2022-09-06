package tw.com.eeit.breadshop.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.eeit.breadshop.user.model.bean.Users;
import tw.com.eeit.breadshop.user.service.UserService;

@WebServlet("/Login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String account = request.getParameter("account");
		String password = request.getParameter("password");

		Users u = new Users();
		u.setAccount(account);
		u.setPassword(password);

		u = new UserService().testLogin(u);
		if (u != null) {
			HttpSession session = request.getSession();
			session.setAttribute("users", u);

			response.sendRedirect(request.getServletContext().getContextPath() + "/GetAllProduct.do");
		} else {
			request.setAttribute("message", "登入失敗");
			request.getRequestDispatcher("page/login.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
