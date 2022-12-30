package exception_handling;

import java.util.Scanner;

class Demo1{
	void fun1() {
		System.out.println("Connection Established");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a = scan.nextInt();
		System.out.println("Enter the denominator");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
		
		System.out.println("Connection terminated");
	}
	
}

class Demo2{
	
}

class Demo3{
	void fun3() {
		Demo1 d1 = new Demo1();
		d1.fun1();
	}
}

class Demo4{
	void fun4() {
		Demo3 d3 = new Demo3();
		d3.fun3();
	}
}

public class Launch {
	public static void main(String[] args) {
		try {
			Demo4 d4 = new Demo4();
			d4.fun4();
		}
		catch(ArithmeticException e) {
			System.out.println("Problem resolved in main");
			e.printStackTrace();
		}
	}
}
