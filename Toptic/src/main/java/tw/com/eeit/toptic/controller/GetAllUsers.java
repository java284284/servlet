package tw.com.eeit.toptic.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.toptic.model.bean.Users;
import tw.com.eeit.toptic.service.UsersService;

@WebServlet("/GetAllUsers.do")
public class GetAllUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 ArrayList<Users> aL = new UsersService().getAllUsers();
		 
		 request.setAttribute("allUsers", aL);
		 request.getRequestDispatcher("page/users.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
