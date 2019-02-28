package com.cg.hr.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.exception.EmpException;
import com.cg.hr.service.EmployeeService;
import com.cg.hr.service.IEmployeeService;

@WebServlet("*.hr")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public IEmployeeService serv;
	
	@Override
	public void init() throws ServletException {
		super.init();
		serv = new EmployeeService();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = super.getServletContext();
		IEmployeeService serv = (IEmployeeService) ctx.getAttribute("serv");
		String url = request.getRequestURI();
		//System.out.println(getCommand(url));
//		PrintWriter pw = response.getWriter();
//		pw.print("URL:"+getCommand(url));
		String command = getCommand(url);
		RequestDispatcher dispatch = null;
		String jspName = null;
		String prefix = "/WEB-INF/pages/";
		String postfix = ".jsp";
		try {
			switch(command)
			{
			case "*":
			case "homepage":
				jspName = "Welcome";
				break;
			case "loginPage":
				jspName = "Login";
				break;
			case "authenticate":
					String username = request.getParameter("user");
					String password = request.getParameter("pwd");
					
					if(username.equals("aa") && password.equals("aa"))
					{
						String name = "rahul sharma";
						request.setAttribute("uname", name);
						jspName = "mainMenu";
					}
					else
					{
						request.setAttribute("msg", "wrong user name pwd.");
						jspName = "Login";
					}
					break;
			case "printlist":
				ArrayList<Employee> emplist = serv.fetchAllEmp();
					request.setAttribute("list", emplist);
					jspName = "Emplist";
					break;
			case "EmpDetails":
					String strId = request.getParameter("id");
					int empId = Integer.parseInt(strId);
					Employee emp = serv.getEmpByEid(empId);
					request.setAttribute("emp", emp);
					jspName = "empdetails";
					break;
			}
		} catch (EmpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dispatch = request.getRequestDispatcher(prefix+jspName+postfix);
		dispatch.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		
	}

	private String getCommand(String url)
	{
		int idxSlash = url.lastIndexOf("/");
		int idxDot = url.lastIndexOf(".");
		return url.substring(idxSlash+1, idxDot);
	}
}
