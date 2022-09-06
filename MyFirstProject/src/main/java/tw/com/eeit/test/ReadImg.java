package tw.com.eeit.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReadImg")
public class ReadImg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Student\\Desktop\\A.jpg");

		 byte[] bytes = fis.readAllBytes();

		 fis.close();

		 ServletContext context = getServletContext();
		System.out.println();

		 FileOutputStream fos = new FileOutputStream(context.getRealPath(".")+"\\A.jpg");

		 fos.write(bytes);

		 fos.close();

		 response.sendRedirect("GetImg.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
