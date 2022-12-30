package com.coupling;

public class Mobile {
	
	OS os;
	Charger c;
	public Mobile() {
		//Tightly coupled
		os = new OS("Iphone", "v5.0");
	}
	
	public void has_A(Charger c) {
		this.c=c;
	}

}
