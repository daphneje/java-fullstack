package exception_handling;

import java.util.Scanner;

public class LaunchDemo2 {
	public static void main(String[] args) {
		System.out.println("Connection Established");
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = scan.nextInt();
			System.out.println("Enter the denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		}

		catch(Exception e) {
			System.out.println("Please enter non-zero denominator");
		}
		
		System.out.println("Connection terminated");
	}
}