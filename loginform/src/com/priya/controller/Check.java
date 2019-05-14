package com.priya.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.priya.model.Registerbean;
import com.priya.serviceimpl.RegisterServiceImpl;
import com.priya.validate.Registervalidate;

/**
 * Servlet implementation class Check
 */
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		PrintWriter out=response.getWriter();//get the stream to write the data 
		String username = request.getParameter("username");
		String password = request.getParameter("normalpassword");
		String cpassword = request.getParameter("cpassword");
		String number = request.getParameter("number");
		
	/*	out.println("username:" +username);
		out.println("password:" +username);
		out.println("cpassword:" +cpassword);
	    out.println("mobile number:" +number);*/
	    
	  System.out.println(username+password+cpassword+number);
	  
	  Registervalidate padmesh= new Registervalidate();
	  RegisterServiceImpl service=new RegisterServiceImpl();
	    
	    
	    Registerbean data=padmesh.validate(username,password,cpassword,number);//servlet to validate, validate to servlet
	    
	    System.out.println(data.getUsername());
	    System.out.println(data.getPassword());
	    System.out.println(data.getCpassword());
	    System.out.println(data.getNumber());
	    
	   int returnservicce= service.insertservice(data);
	    
	   if(returnservicce==1) {
				RequestDispatcher rd=request.getRequestDispatcher("NewFile1.jsp");
				rd.include(request,response);
		   }else {
					RequestDispatcher rd1=request.getRequestDispatcher("index.jsp");
					rd1.include(request,response);
			}
				
	  
	}
	
}
	    
	    
	    
	


