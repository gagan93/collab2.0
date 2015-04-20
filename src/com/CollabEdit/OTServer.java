package com.CollabEdit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class OTServer
 */
@WebServlet("/OTServer")
public class OTServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OTServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
	    response.setContentType("application/json");
		System.out.println("im in PSOT");
		String success = "\"success\"";
		String error =  "\"error\"";
		String successCode = null;
		String errorCode =null ;
		
		try{
		String action = request.getParameter("action");
		String data = request.getParameter("data");
		String lineLocation = request.getParameter("lineLocation"); 
		String charLocation = request.getParameter("charLocation");
		

	    successCode = "\"001\"";
	    errorCode = "\"987\"";
	    }
	    catch(Exception e)
	    {
		    successCode = "\"100\"";
		    errorCode = "\"786\"";	    	
	    }
		finally{
			StringBuilder sb = new StringBuilder("{");
		    sb.append(success+":"+successCode+",");
		    sb.append(error+":"+errorCode+"}");
			out.println(sb.toString());
			System.out.println("donee in servlet");
			out.close();
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	    response.setContentType("application/json");
		System.out.println("im in PSOT");
		String success = "\"success\"";
		String error =  "\"error\"";
		String successCode = null;
		String errorCode =null ;
		
		try{
		String action = request.getParameter("action");
		String data = request.getParameter("data");
		String lineLocation = request.getParameter("lineLocation"); 
		String charLocation = request.getParameter("charLocation");
		
		

	    successCode = "\"001\"";
	    errorCode = "\"987\"";
	    }
	    catch(Exception e)
	    {
		    successCode = "\"100\"";
		    errorCode = "\"786\"";	    	
	    }
		finally{
			StringBuilder sb = new StringBuilder("{");
		    sb.append(success+":"+successCode+",");
		    sb.append(error+":"+errorCode+"}");
			out.println(sb.toString());
			System.out.println("donee in servlet");
			out.close();
		}
	}

}
