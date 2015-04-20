package com.CollabEdit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Document
 */
@WebServlet("/Document/*")
//@WebServlet(asyncSupported = false, name = "Document", urlPatterns = {"/Document/*"})
public class Document extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int i =0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Document() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{ 
			i++;
		
		System.out.println(i);	
		
			
			System.out.println("document called IN GET ");
			//System.out.println("request: "+request.getRequestDispatcher("main.html"));
			System.out.println("response: "+response);
			System.out.println("forwarding: ");
			//response.sendRedirect("main.html");
			//run again
		RequestDispatcher rs = request.getRequestDispatcher("/main.jsp");
		rs.forward(request, response);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("document called IN post");
		}

}
