package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.User;
import UserDao.UserServiceImpl;
//static printWriter 
/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//ServletResponse responce;
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("t1");
		String password =request.getParameter("t2");
		UserServiceImpl service = new UserServiceImpl();
		//create of serevlet of userserviceImpl
		
		User user=service.getLogin(uname, password);
		if(user != null) {
			String userType = service.getUserType(user.getUserId());
			if(userType.equals("admin"))
			{
				out.println("welcome admin");
				response.sendRedirect("adminPage.jsp");
				
				
				
				
			}
			else if(userType.equals("customer"))
			{
				//out.println("welcome customer");	
				response.sendRedirect("customerPage.jsp");
				
				
		}
		}
		
		//**********************************************
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
