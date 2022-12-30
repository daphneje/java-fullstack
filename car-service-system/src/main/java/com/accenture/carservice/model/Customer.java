package com.accenture.carservice.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Customer {
	private String name;
	private String username;
	private String password;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Customer(String name, String username, String password, String email) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public Customer() {
		
	}
	
		public int customerRegister() {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				System.out.println("Driver loaded successfully");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_service_app", "root", "Password1234");
				System.out.println("Connection established successfully");
				
				String s1 = "select * from customer_db where username=?";
				PreparedStatement pstmt1 = con.prepareStatement(s1);
				pstmt1.setString(1, username);
				ResultSet res = pstmt1.executeQuery();
				
				if(res.next()) {
					return -1;//duplicate username;
				}
				else {
					String s = "insert into customer_db values(?, ?, ?, ?) ";
					PreparedStatement pstmt = con.prepareStatement(s);
				
					pstmt.setString(1, name);
					pstmt.setString(2, username);
					pstmt.setString(3, password);
					pstmt.setString(4, email);
					int rows = pstmt.executeUpdate();
					return rows;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return 0;
		}
		
		public ArrayList<CustomerDetail> viewCustomers() {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				System.out.println("Driver loaded successfully");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_service_app", "root", "Password1234");
				System.out.println("Connection established successfully");
				
				String s = "select * from customer_db";
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery(s);
				
				ArrayList<CustomerDetail> al = new ArrayList<CustomerDetail>();
				while(res.next()) {
					name = res.getString(1);
					username = res.getString(2);
					email = res.getNString(4);
					al.add(new CustomerDetail(name, username, email));
				}
				return al;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
}
