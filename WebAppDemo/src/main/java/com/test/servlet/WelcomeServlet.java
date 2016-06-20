package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{

	public WelcomeServlet(){
		System.out.println(" Created WelcomeServlet Obejct !!!1");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet - Begin");
		
		//Redirect to View
		resp.sendRedirect("showdate.jsp");
		
		//PrintWriter out = resp.getWriter();
		//out.println("<HTML><head><title>Servlet</title><body><h1>Hello World ......</h1>");
		//out.println("Date :   " + new Date());
		//out.println("</body></html>");
		
		System.out.println("Servlet - End");
	}

}
