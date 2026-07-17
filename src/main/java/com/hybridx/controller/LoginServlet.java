package com.hybridx.controller;

import com.hybridx.dao.AthleteDAO;
import com.hybridx.model.Athlete;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	AthleteDAO dao = new AthleteDAO();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Athlete athlete = dao.Login(email, password);
			if(athlete != null) {
				HttpSession session = request.getSession();
				session.setAttribute("athlete", athlete);
				response.sendRedirect("Dashboard.jsp");
			}else {
				request.setAttribute("error", "Incorrect Email or Password");
				request.getRequestDispatcher("Home.jsp").forward(request, response);
			}
		}catch(Exception exception) {
			exception.printStackTrace();
		}
	}
}
