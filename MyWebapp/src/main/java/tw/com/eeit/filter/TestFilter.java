package tw.com.eeit.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.eeit.bean.Users;

@WebFilter("/SessionTest/*")
public class TestFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter init...");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		HttpSession session = httpRequest.getSession();
		Users user = (Users) session.getAttribute("loginUser");

		if (user == null) {
			session.setAttribute("message", "請登入");
			httpResponse.sendRedirect("/MyWebapp/errorPage.jsp");
			return;
		}

		System.out.println("請求到達「指定資源」之前，做點事情");

		chain.doFilter(request, response);

		System.out.println("回應完成之前，做點事情");

	}

	public void destroy() {
		System.out.println("Filter destory...");
	}
}
