package tw.com.eeit.toptic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.toptic.service.UsersService;

@WebServlet("/GetImg.do")
public class GetImg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String imgId = request.getParameter("id");
		UsersService UsersService = new UsersService();

		byte[] bytes = UsersService.getImgByName(imgId);

		
		response.setContentType(getServletContext().getMimeType(imgId));
		
		ServletOutputStream out = response.getOutputStream();
		out.write(bytes);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
