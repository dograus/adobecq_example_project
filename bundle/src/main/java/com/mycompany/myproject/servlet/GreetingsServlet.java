package com.mycompany.myproject.servlet;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

@SlingServlet(paths="/bin/greetings.html", methods="GET")
public class GreetingsServlet extends SlingSafeMethodsServlet {

	private static final long serialVersionUID = -1291471765718557356L;
	
	@Override
	public void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException
	{
		//response.setContentType("application/html");
		
		response.getWriter().print("<h1> Hello World");
	}
	

}
