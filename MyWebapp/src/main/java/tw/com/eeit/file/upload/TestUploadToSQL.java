package tw.com.eeit.file.upload;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Base64;

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
		InputStream userIn = userPhoto.getInputStream();
		String imgBase64String = Base64.getEncoder().encodeToString(userIn.readAllBytes());
		String imgBase64StringWithMimeType = "data:" + fileType + ";base64," + imgBase64String;

		String connectionUrl = "jdbc:sqlserver://localhost:1433;database=JDBCDemoDB;user=sa;password=1234;trustServerCertificate=true;";

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(connectionUrl);

			PreparedStatement preState = conn
					.prepareStatement("INSERT INTO [dbo].[eeit47_user](name,photo,type,photo_base64) VALUES (?,?,?,?)");
			preState.setString(1, userName);
			preState.setBinaryStream(2, userPhoto.getInputStream());
			preState.setString(3, fileType);
			preState.setString(4, imgBase64StringWithMimeType);
			preState.execute();

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
