package tw.com.eeit.toptic.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.toptic.conn.ConnectionFactory;
import tw.com.eeit.toptic.model.bean.Users;
import tw.com.eeit.toptic.model.dao.UsersDAO;

@WebServlet("/TestServlet1")
public class TestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		ServletContext context = getServletContext();
		try {
//			ArrayList<Users> aL = new UsersDAO(ConnectionFactory.getConnection()).readAllUsers();
//			System.out.println(aL.get(0).getName());
			
//			Users p = new Users("","Dom123","123","Dom");
//			new UsersDAO(ConnectionFactory.getConnection()).createUsers(p);
			
			Users p = new Users("6","XXX123","123","XXX");
			Connection conn = ConnectionFactory.getConnection();
			new UsersDAO(conn).updateUsers(p);
		
//			Users p = new Users("1","XXX123","123","XXX");
//			Connection conn = ConnectionFactory.getConnection();
//			new UsersDAO(conn).deleteUsers(p);
//			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
