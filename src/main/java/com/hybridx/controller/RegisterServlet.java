package com.hybridx.controller;

import java.io.IOException;

import com.hybridx.dao.AthleteDAO;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		AthleteDAO dao = new AthleteDAO();
		
		try {
			dao.Signup(name, email, password);
			response.sendRedirect("Home.jsp?Success=1");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
