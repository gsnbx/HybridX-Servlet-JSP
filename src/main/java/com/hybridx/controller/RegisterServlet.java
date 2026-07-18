package com.hybridx.controller;

import java.io.IOException;

import com.hybridx.dao.AthleteDAO;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/signup")
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		AthleteDAO dao = new AthleteDAO();
		
		try {
			dao.Signup(name, email, password);
			HttpSession session = request.getSession();
			session.setAttribute("Success", "User created");
			response.sendRedirect("Home.jsp");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
