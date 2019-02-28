package com.cg.hr.listen;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.cg.hr.service.EmployeeService;
import com.cg.hr.service.IEmployeeService;

/**
 * Application Lifecycle Listener implementation class ServletListener
 *
 */
@WebListener
public class ServletListener implements ServletContextListener {
	
	public IEmployeeService serv;
    
    public ServletListener() {
        // TODO Auto-generated constructor stub
    }

	
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	serv = null;
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	serv = new EmployeeService();
    	ServletContext ctx = arg0.getServletContext();
    	ctx.setAttribute("serv", serv);
    	
    }
	
}
