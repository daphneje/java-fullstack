package farmersloan;

import java.util.Scanner;

public class Farmer {
	
	int principle;
	int duration;
	
	public int inputPrinciple() {
		System.out.println("Farmer, input principle amount.");
		Scanner scan  = new Scanner(System.in);
		principle = scan.nextInt();
		return principle;
	}
	
	public int inputDuration() {
		System.out.println("Farmer, input loan duration in years.");
		Scanner scan  = new Scanner(System.in);
		duration = scan.nextInt();
		return duration;
	}

}
