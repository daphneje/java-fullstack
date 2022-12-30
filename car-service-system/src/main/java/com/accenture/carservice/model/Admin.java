package com.accenture.carservice.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admin {
	private String adminUsername;
	private String adminPassword;
	
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPasswword() {
		return adminPassword;
	}
	public void setAdminPasswword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	public Admin(String adminUsername, String adminPassword) {
		super();
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
	}
	
	public int adminLogin() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded successfully");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_service_app", "root", "Password1234");
			System.out.println("Connection established successfully");
			
			String s = "select * from admin_db where admin_username=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			
			pstmt.setString(1, adminUsername);
			ResultSet res = pstmt.executeQuery();
			
			if(res.next()) {
				if(res.getString(2).equals(adminPassword)) {
					return 1; //valid password
				}
				else {
					return 0; //invalid password
				}
			}
			else {
				return -1; //invalid username
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}
}
