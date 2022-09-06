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

@WebServlet("/showAllUsers.do")
public class ShowAllUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 第一步，接受前端請求與參數
		// 第二步，呼叫邏輯處理程式，取得資料

		ArrayList<Users> aL = new UsersService().getAllUsers();
		// 第三步，呼叫View程式，呈現結果(JSP)

		request.setAttribute("users", aL);
		request.getRequestDispatcher("pages/showAllUsers.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
