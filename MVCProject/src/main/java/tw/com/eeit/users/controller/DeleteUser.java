package tw.com.eeit.users.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.users.model.bean.Users;
import tw.com.eeit.users.service.UsersService;

@WebServlet("/DeleteUser.do")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 第一步，接受前端請求與參數(拿到ID)
		String userID = request.getParameter("userID");

		// 第二步，呼叫邏輯處理程式，取得資料(UsersService().deleteUser(id))
		UsersService usersService = new UsersService();
		boolean isDelete = usersService.deleteUserByID(userID);

		System.out.println(isDelete);
		// 第三步，呼叫View程式，呈現結果(JSP)
		if (isDelete) {
			ArrayList<Users> aL = usersService.getAllUsers();
			request.setAttribute("users", aL);
			request.setAttribute("message", "刪除成功");
			request.getRequestDispatcher("pages/showAllUsers.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
