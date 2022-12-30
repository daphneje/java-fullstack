package com.accenture.bookingcounter.main;

import com.accenture.bookingcounter.BusCounter;
import com.accenture.bookingcounter.Customer;

public class LaunchApp {
	public static void main(String[] args) {
		
		BusCounter bc = new BusCounter();
		
		Customer c1 = new Customer("Ramu", 2, bc);
		Customer c2 = new Customer("Raju", 2, bc);
		
		c1.start();
		c2.start();
	}

}