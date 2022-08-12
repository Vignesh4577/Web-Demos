package com.healthinsurance.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthinsurance.model.Plan;

/**
 * Servlet implementation class AddServlate
 */
@WebServlet("/addServlate")
public class AddServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("type/html");

		String planName = request.getParameter("planName");
		String category = request.getParameter("category");
		String brand = request.getParameter("brand");
		String coverage = request.getParameter("coverage");
		double suminsured= Double.parseDouble(request.getParameter("suminsured"));
		
		//create a plan object
		Plan plan = new Plan();
		plan.setPlanName(planName);
		plan.setBrand(brand); 
		plan.setCategory(category); 
		plan.setCoverage(coverage); 
		plan.setSumInsured(suminsured); 
		
		//set the plan object with dummy name
		request.setAttribute("plan", plan);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);




	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
