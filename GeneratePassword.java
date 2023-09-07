package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GeneratePassword
 */
public class GeneratePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneratePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=(String) request.getAttribute("nameKey");
		String city=(String)request.getAttribute("cityName");
		Long ph=(Long)request.getAttribute("phoneKey");
		String ph1 = ph.toString();
		String p1 = name.substring(0,1);
		String p2 = city.substring(city.length()-1);
		String p3 = ph1.substring(ph1.length()-4);
		String finalPassword=p1.concat(p2).concat(p3);
		PrintWriter out=response.getWriter();
		out.println("<h2> Your Password is" + " "+finalPassword+" "+"</h2>");
		response.setContentType("text/html");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
