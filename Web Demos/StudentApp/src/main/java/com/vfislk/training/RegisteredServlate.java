package com.vfislk.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisteredServlate
 */
@WebServlet("/registeredServlate")
public class RegisteredServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisteredServlate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		int studentid = Integer.parseInt(request.getParameter("studentId"));
		String city = request.getParameter("city");
		String language = request.getParameter("langauage");
		String hobbies[] = request.getParameterValues("hobby");
		
		out.print("<html><body>");
		out.print("<strong>Welcome "+username+"</strong><br>");
		out.print("Your Id "+studentid+"<br>");
		out.print("Your city is "+city+"<br>");
		out.print("Language - "+language+"<br>");
		Stream.of(hobbies).forEach(out::print);
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
