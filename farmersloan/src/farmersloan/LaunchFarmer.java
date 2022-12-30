package farmersloan;

import java.util.Scanner;

class Farmer{
	float principle;
	float time;
	float rateOfInterest;
	float simpleInterest;
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle");
		principle = scan.nextFloat();
		System.out.println("Enter the duration");
		time = scan.nextFloat();
		rateOfInterest = 2.5f;
	}
	
	void compute() {
		simpleInterest = (principle*time*rateOfInterest)/100;
	}
	
	void display() {
		System.out.println(simpleInterest);
	}
}

public class LaunchFarmer {
	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		
		f1.acceptInput();
		f1.compute();
		f1.display();
		
		f2.acceptInput();
		f2.compute();
		f2.display();
		
		f3.acceptInput();
		f3.compute();
		f3.display();
	}
}
