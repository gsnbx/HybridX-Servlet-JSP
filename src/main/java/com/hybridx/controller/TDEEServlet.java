package com.hybridx.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/tdee")
public class TDEEServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Double weight = Double.parseDouble(request.getParameter("weight"));
		Double height = Double.parseDouble(request.getParameter("height"));
		Double activityMultiplier = Double.parseDouble(request.getParameter("activity"));
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender").toLowerCase();
		double tdee = 0;
		
		if(gender.equals("male")) {
			tdee = ((10*weight) + (6.25*height) - (5*age) + 5)* activityMultiplier;
		}else {
			tdee = ((10*weight) + (6.25*height) - (5*age) - 161) * activityMultiplier;
		}
		
		request.setAttribute("tdee", tdee);
		RequestDispatcher rd = request.getRequestDispatcher("tdeeResult.jsp");
		rd.forward(request, response);		
		
	}
}
