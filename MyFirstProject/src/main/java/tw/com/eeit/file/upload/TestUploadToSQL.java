package tw.com.eeit.file.upload;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/TestUploadToSQL.do")
public class TestUploadToSQL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("myName");
		Part userPhoto = request.getPart("myPhoto");
		String fileType = userPhoto.getContentType();
		String connectionUrl = "jdbc:sqlserver://localhost:1433;database=JDBCDemoDB;user=sa;password=password284;trustServerCertificate=true;";

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(connectionUrl);

			PreparedStatement preState = conn.prepareStatement("INSERT INTO [dbo].[eeit47_user](name) VALUES (?)");
			preState.setString(1, userName);
			preState.executeUpdate();

			preState.close();
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
