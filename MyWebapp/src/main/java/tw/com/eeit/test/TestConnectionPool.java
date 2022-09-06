package tw.com.eeit.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import tw.com.eeit.conn.ConnectionFactory;

@WebServlet("/TestConnectionPool.do")
public class TestConnectionPool extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			Connection conn = ConnectionFactory.getConnection();

			Statement state = conn.createStatement();
			ResultSet rs = state
					.executeQuery("SELECT * FROM [AdventureWorks2017].[Person].[Person] WHERE BusinessEntityID<10");
			while (rs.next()) {
				System.out.println(rs.getString("FirstName"));
			}
			conn.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
