package tw.com.eeit.toptic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import tw.com.eeit.toptic.model.bean.Users;
import tw.com.eeit.toptic.service.UsersService;

@WebServlet("/AddUsers.do")
@MultipartConfig
public class AddUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String pAccount = request.getParameter("usersAccount");
		String pPassword = request.getParameter("usersPassword");
		String pName = request.getParameter("usersName");
		Part pPart = request.getPart("usersImg");

		Users p = new Users();
		p.setAccount(pAccount);
		p.setPassword(pPassword);
		p.setName(pName);
		p.setImg(pPart.getInputStream().readAllBytes());

		UsersService usersService = new UsersService();
		String message = usersService.addUsers(p);
		
		request.setAttribute("message", message);
		request.getRequestDispatcher("page/addUsers.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
