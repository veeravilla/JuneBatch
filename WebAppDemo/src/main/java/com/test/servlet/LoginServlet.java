package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	public LoginServlet(){
		System.out.println(" Created LoginServlet Obejct !!!");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet - Begin");
		
		//B.L
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println(" USer Name : " + username + " Password : "  + password);
		
		if(username.equals("jhon") && password.equals("password1")){ //JDBC /JPA
			System.out.println(" Login Success");
			
			//Redirect to View
			resp.sendRedirect("home.jsp");
		}else{
			System.out.println(" Login Failure");
			
			//Redirect to View
			resp.sendRedirect("login.jsp");
		}
		
		

		System.out.println("Servlet - End");
	}

}
