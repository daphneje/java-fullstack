package com.accenture.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accenture.model.Model;

public class GetResult extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		Model m = new Model();
		m.setId(id);
		int x = m.getResult();
		
		id = m.getId();
		String name = m.getName();
		int marks1 = m.getMarks1();
		int marks2 = m.getMarks2();
		int marks3 = m.getMarks3();
		
		HttpSession session = request.getSession(true);
		session.setAttribute("id", id); // session id (id) = id
		session.setAttribute("name", name); 
		session.setAttribute("marks1", marks1); 
		session.setAttribute("marks2", marks2); 
		session.setAttribute("marks3", marks3); 
		
		if(x==1) {
			response.sendRedirect("/get-result-mvc/GetResultSuccess.jsp");
		}
		else {
			response.sendRedirect("/get-result-mvc/GetResultFailure.jsp");
		}
	}
}
