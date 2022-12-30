package com.accenture.bookingcounter;

public class Customer extends Thread{
	private String customerName;
	private int numberOfSeats;
	private BusCounter busCounter;
	
	public Customer(String customerName, int numberOfSeats, BusCounter busCounter) {
		super();
		this.customerName = customerName;
		this.numberOfSeats = numberOfSeats;
		this.busCounter = busCounter;
	}
	
	public void run() {
		busCounter.bookTicket(customerName, numberOfSeats);
	}
}