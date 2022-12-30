package com.accenture.carservice.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accenture.carservice.model.Customer;
import com.accenture.carservice.model.CustomerDetail;

public class ViewCustomers extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer c = new Customer();
		ArrayList<CustomerDetail> al = c.viewCustomers();
		
		HttpSession session = request.getSession(true);
		session.setAttribute("al", al);
		response.sendRedirect("/car-service-system/ViewCustomersSuccess.jsp");
	}
}
