 package com.controller;

import java.io.IOException;
import java.lang.NumberFormatException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FiresServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//HttpSerevletRequest
		String name = request.getParameter("name");
		String cityName = request.getParameter("city");
		long phone = Long.parseLong(request.getParameter("phone"));
		String dob= request.getParameter("dob");
		String Gender= request.getParameter("gen");
		String[] qualification = request.getParameterValues("quali");
		PrintWriter out=response.getWriter();
		out.println("<h1> Thanks For Registration your details are </h1>");
		out.println("<h2> Name: "+" "+name+" "+"</h2>");
		out.println("<h2> City: "+" "+cityName+" "+"</h2>");
		out.println("<h2> Phone: "+" "+phone+" "+"</h2>");
		out.println("<h2> Gender:"+" "+dob+" "+"</h2>");
		for(String s:qualification) {
			
			out.println("<h2>" + " " +s+ " " + "</h2>");
		}
		response.setContentType("text/html");
		
	request.setAttribute("nameKey", name);
	request.setAttribute("cityName", cityName);
	request.setAttribute("phoneKey", phone);
		
		RequestDispatcher rd = request.getRequestDispatcher("/GeneratePassword");
		rd.include(request, response);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
