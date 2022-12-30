package com.accenture.user.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LaunchUser {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("1. New customer/Register");
		System.out.println("2. Existing customer/Login");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1: register();
		break;
		case 2: login();
		break;
		default: System.out.println("Invalid Selection");
		break;
		}
	}
	
	static void register () throws Exception {
		String name = null;
		String username = null;
		String password = null;
		int phoneNumber = 0;
		String email = null;
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root", "Password1234");
		System.out.println("Connection established successfully");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		name = scan.next();
		
		while(true) {
			System.out.println("Enter your username:");
			username = scan.next();
			
			String s1 = "select * from user where username =?";
			PreparedStatement pstmt1 = con.prepareStatement(s1);
			pstmt1.setString(1,  username);
			ResultSet res = pstmt1.executeQuery();
			
			if(res.next()) {
				System.out.println("Username is already taken, please select a new username.");
			}
			else {
				break;
			}
		}
		
		while(true) {
			System.out.println("Enter your password:");
			password = scan.next();
			
			if(password.length()<8) {
				System.out.println("Please enter a password than is of at least 8 characters.");
			}
			else {
				break;
			}
		}
		
		while(true) {
			System.out.println("Enter your phone number:");
			phoneNumber = scan.nextInt();
			String newPhoneNumber = String.valueOf(phoneNumber);
			
			if(newPhoneNumber.length()!=8) {
				System.out.println("Please enter a valid phone number");
			}
			else {
				break;
			}
		}
		
		System.out.println("Enter your email:");
		email = scan.next();
		
		String s2 = "insert into user values(?,?,?,?,?)";
		
		PreparedStatement pstmt2 = con.prepareStatement(s2);
		pstmt2.setString(1, name);
		pstmt2.setString(2, username);
		pstmt2.setString(3, password);
		pstmt2.setInt(4, phoneNumber);
		pstmt2.setString(5, email);

		int rows = pstmt2.executeUpdate();
			
		if(rows>0) {
			System.out.println("You have successfully registered");
		}
		else {
			System.out.println("Registration failed");
		}
	}
	
	static void login() throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root", "Password1234");
		System.out.println("Connection established successfully");
		
		String username = null;
		String password = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username:");
		username = scan.next();
		System.out.println("Enter the password:");
		password = scan.next();
		
		String s = "select * from user where username=?";
		PreparedStatement pstmt = con.prepareStatement(s);
		pstmt.setString(1, username);
		ResultSet res = pstmt.executeQuery();
		
		if(res.next()) {
			if(res.getString(3).equals(password)) {
				System.out.println("Login success");
			}
			else {
				System.out.println("Invalid password");
			}
		}
		else {
			System.out.println("Invalid username");
		}
		
	}
}





