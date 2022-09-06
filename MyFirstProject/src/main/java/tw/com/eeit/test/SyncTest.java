package tw.com.eeit.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SyncTest")
public class SyncTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count = 0;

	synchronized protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		int myCount;
		synchronized (this) {
			 myCount = ++count;
			}

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}

			response.getWriter().write("count" + myCount);
		}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
