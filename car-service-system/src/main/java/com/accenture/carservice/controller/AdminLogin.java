package com.accenture.carservice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accenture.carservice.model.Admin;

public class AdminLogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminUsername = request.getParameter("adminUsername");
		String adminPassword = request.getParameter("adminPassword");
		
		Admin a = new Admin(adminUsername, adminPassword);
		int x = a.adminLogin();
		
		if(x == -1) {
			response.sendRedirect("/car-service-system/InvalidUsername.jsp");
		}
		else if(x == 0) {
			response.sendRedirect("/car-service-system/InvalidPassword.jsp");
		}
		else {
			response.sendRedirect("/car-service-system/LoginSuccess.jsp");
		}
	}
}
