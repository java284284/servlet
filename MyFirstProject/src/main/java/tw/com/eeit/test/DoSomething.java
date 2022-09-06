package tw.com.eeit.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.catalina.connector.Response;
//
@WebServlet(urlPatterns =  "/DoSomething.do",name="AAA")
//@WebServlet("/DoSomething.do")
public class DoSomething extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{ 
		request.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html;charset=UTF-8");
		
		String myName = request.getParameter("userName");
		int myAge = Integer.parseInt(request.getParameter("userAge"));
		
				PrintWriter out = response.getWriter();
		 
		out.write("<div>"+ myName +"</div");
		out.write("<div>"+ myAge +"</div");
	
	out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
