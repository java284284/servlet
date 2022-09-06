package tw.com.eeit.file.upload;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(location = "C:\\temp")
@WebServlet("/TestUpload.do")
public class TestUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("myName");

		Collection<Part> ps = request.getParts();

		for (Part p : ps) {
			if (p.getContentType() != null) {
				String cDHeader = p.getHeader("content-disposition");
				String fileName = cDHeader.substring(cDHeader.lastIndexOf("=\"") + 2, cDHeader.length() - 1);
				p.write(userName + "_" + fileName);
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
