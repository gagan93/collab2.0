package com.CollabEdit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String email = request.getParameter("username");
		String pass = request.getParameter("password");
		if(Authentication.checkUserCredentials(email, pass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("LoggedInUserEmail", email);
			session.setMaxInactiveInterval(30*60);
			Cookie userName = new Cookie("LoggedInUser", email);
            userName.setMaxAge(30*60);
            response.addCookie(userName);
		RequestDispatcher rs = request.getRequestDispatcher("create_file.html");
		rs.forward(request, response);
		}
		else
		{
			out.println("<html><head></head><body><h4><font color=red> Username or Password is incorrect </font></h4></body><html>");
			RequestDispatcher rs = request.getRequestDispatcher("index.html");
			rs.include(request, response);
		}
	}

}
