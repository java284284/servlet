package tw.com.eeit.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/BBB.do", 
initParams = @WebInitParam(name = "color", value = "red"))
public class GetInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		String c = getInitParameter("color");
		System.out.println(c);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
