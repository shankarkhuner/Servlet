package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Admin;
import Model.Customer;
import Model.User;
import Service.userService;
import UserDao.UserServiceImpl;

/**

 */
public class SignUserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUserServelet() {
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

		//creating object of UserServiceImpl class
		userService  service=new UserServiceImpl();
		//taking input name from HTML element using request object
String name=request.getParameter("name");
////taking input address from HTML element using request object
String address=request.getParameter("address");
////taking input phone from HTML element using request object
String phone=request.getParameter("phone");
////taking input dob from HTML element using request object
String dob1=request.getParameter("dob");
////taking input gen from HTML element using request object
String gen=request.getParameter("gen");
//creating userName by using subString() method of  String by retreving last digit number

String userName=phone.substring(phone.length()-4);
//constructing password by taking last character from name
String p1=name.substring(name.length()-1);
//constructing password by taking first character from address
String p2=address.substring(0,1);
//constructing password by taking last two character from dob
String p3=dob1.substring(dob1.length()-2);
//concatinating all name, password and dob to generate a passsword
String finalPassword=p1.concat(p2).concat(p3);

//creating object of PrintWriter to print message to browser
//by onvoking getWriter() method
PrintWriter out=response.getWriter();
//setting content type to response obejct as text/html
response.setContentType("text/html");
//here if you register using adming name then the true block of if will be executed
	if(name.startsWith("ADMIN") || name.startsWith("admin"))
	{
		//converting string phone to long
		long ph=Long.parseLong(phone);
		//using DataTimeFormatter object passing pattern in yyyy-MM-dd format
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//converting string into LocalDate object
		LocalDate dob=LocalDate.parse(dob1, df);
		//constrcuting admin a objcect by calling admin constrcutor
		User user=new Admin(userName, finalPassword, name, address, ph, dob, gen);
		//calling signUp method of UserService
		service.signUp(user);
		out.println("<h3> Thanks " + " "+ name+ " "+" for registration </h3>");
		out.println("<h3> you can login by using your user name"+ " "+userName);
		out.println("<h3> you can login by using your password"+ " "+finalPassword);
		out.println("<h3>login from here...."+ "<a href='login.jsp'>Login</a></h3>");

		
		
		
		
	}else
	{
		long ph=Long.parseLong(phone);
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dob=LocalDate.parse(dob1, df);
		User user=new Customer(userName, finalPassword, name, address, ph, dob, gen);
		service.signUp(user);
		out.println("<h3> Thanks " + " "+ name+ " "+" for registration </h3>");
		out.println("<h3> you can login by using your user name"+ " "+userName);
		out.println("<h3> you can login by using your password"+ " "+finalPassword);
		out.println("<h3>login from here...."+ "<a href='login.jsp'>Login</a></h3>");

	}
	}
}