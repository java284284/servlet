package tw.com.eeit.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class initListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce)  { 
		System.out.println("web up");
		ServletContext context = sce.getServletContext();
		
    }
    public void contextDestroyed(ServletContextEvent sce)  {
    	System.out.println("web close");
    }

    
	
}
