package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.InterningXmlVisitor;
import com.test.jdbc.StudentDAO;
import com.test.jdbc.StudentDTO;

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
		String sno = req.getParameter("sno");
		
		System.out.println(" USer Name : " + username + " Password : "  + password);
		
		if(username.equals("jhon") && password.equals("password1")){ //JDBC /JPA
			System.out.println(" Login Success");
			
			StudentDAO studentDAO = new StudentDAO();
			StudentDTO stuDTO = studentDAO.getStudent(Integer.parseInt(sno));
			
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			req.setAttribute("stuRes", stuDTO);
			rd.forward(req, resp);
			
			//Redirect to View
			//resp.sendRedirect("home.jsp");
		}else{
			System.out.println(" Login Failure");
			
			//Redirect to View
			//resp.sendRedirect("login.jsp");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			req.setAttribute("error", "Invalid User Name & Password. Please Try Again!!!");
			rd.forward(req, resp);
		}
		
		

		System.out.println("Servlet - End");
	}

}
