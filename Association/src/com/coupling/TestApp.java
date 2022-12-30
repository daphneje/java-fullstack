package com.coupling;

public class TestApp {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println(m.os.getName() + " " + m.os.getVersion());
		
		Charger c = new Charger("Iphone", "7500Mah");
		
		System.out.println("Charger Alone");
		System.out.println(c.getModelName() + " " + c.getBatteryCapacity());
		
		System.out.println("Loosely coupled with Mobile Object");

		m.has_A(c);

		System.out.println(m.c.getModelName() + " " + m.c.getBatteryCapacity());
		
		m = null;

		System.out.println("After Mobile is dead");
		System.out.println("Charger Alone");
		System.out.println(c.getModelName() + " " + c.getBatteryCapacity());
		System.out.println("--------------------");
		System.out.println(m.os.getName() + " " + m.os.getVersion());
		
		System.out.println("Charger Alone");

	}

}
