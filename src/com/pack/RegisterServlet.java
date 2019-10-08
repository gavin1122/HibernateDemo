package com.pack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;
import service.UserServiceImpl;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd=null;
	UserService service=new UserServiceImpl();
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		String password= request.getParameter("password");
		String email= request.getParameter("email");
		
		User newuser = new User(name,password,email);
		
		int returnval=service.register(newuser);
		if(returnval>0)
		{
			request.setAttribute("newuser", newuser);
			rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			response.getWriter().print("error for registering");
			rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
