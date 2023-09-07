package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UserDao.FlightServiceImpl;

/**
 * Servlet implementation class AddFlight
 */
public class AddFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		String fName = request.getParameter("t1");
		String source = request.getParameter("t2");
		String dest = request.getParameter("t3");
		String fDate = request.getParameter("t4");
		String dPrice = request.getParameter("t5");
		
		Flight flight = new Flight();
		flight.setFlightName(fName);
		flight.setSource(source);
		flight.setDestination(dest);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate flightDate=LocalDate.parse(fDate, df);
		flight.setFlyTime(flightDate);
		flight.setFlightPrice(Double.parseDouble(dPrice));
		
		
		FlightServiceImpl service = new FlightServiceImpl();
		Flight flightObj=service.addFlight(flight);
	if(flightObj  !=null) {
		out.println("<h3> Flight Added Successfully");
	}
		
		
		doGet(request, response);
	}

}
