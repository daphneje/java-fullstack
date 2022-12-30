package exception_handling;

import java.util.Scanner;

public class LaunchDemo3 {
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
			
			System.out.println("Enter the size of an array");
			int size = scan.nextInt();
			int arr[] = new int[size];
			
			System.out.println("Enter the element to be inserted");
			int elem = scan.nextInt();
			
			System.out.println("Enter the position at which element should be inserted");
			int position = scan.nextInt();
			
			arr[position] = elem;
		}

		catch(Exception e) {
			System.out.println("Some problem has occured. Please enter the inputs properly.");
		}
		
		System.out.println("Connection terminated");
	}
}

//e.printStackTrace();