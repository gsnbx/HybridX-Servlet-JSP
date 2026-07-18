package com.hybridx.controller;

import java.io.IOException;

import com.hybridx.dao.AdminDAO;
import com.hybridx.model.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/admin")
public class AdminLoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		
		AdminDAO dao = new AdminDAO();
		Admin admin = dao.Login(email,pwd);
		
		HttpSession session = request.getSession();
		if(admin != null) {
			session.setAttribute("admin", admin);
			response.sendRedirect("adminPanel.jsp");
		}else {
			session.setAttribute("error", "Incorrect email or password");
			response.sendRedirect("adminLogin.jsp");
		}
	}
}
