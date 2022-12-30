package interface_example;

import java.util.Scanner;

interface Calculator{
	void add();
	void sub();
	void mul();
	void div();
}

class MyCalculator1 implements Calculator{
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub() {
		int a=30;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	
	public void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	
	public void div() {
		int a=100;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
}

class MyCalculator2 implements Calculator{
	Scanner scan = new Scanner(System.in);
	
	public void add() {
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub() {
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		int c=a-b;
		System.out.println(c);
	}
	
	public void mul() {
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		int c=a*b;
		System.out.println(c);
	}
	
	public void div() {
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
	}
}

class MyCalculator3 implements Calculator{
	Scanner scan = new Scanner(System.in);
	
	public void add() {
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		if(a>0 && b>0) {
			int c=a+b;
			System.out.println(c);
		}
		else{
			System.out.println("Invalid Input");			
		}
	}
	
	public void sub() {
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		if(a>b) {
			int c=a-b;
			System.out.println(c);
		}
		else{
			System.out.println("Invalid Input");			
		}
	}
	
	public void mul() {
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		if(a>0 && b>0) {
			int c=a*b;
			System.out.println(c);
		}
		else{
			System.out.println("Invalid Input");			
		}
	}
	
	public void div() {
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		if(b!=0) {
			int c=a/b;
			System.out.println(c);
		}
		else{
			System.out.println("Invalid Denominator");			
		}
	}
}

class Demo{
	void permit(Calculator ref) {
		ref.add();
		ref.sub();
		ref.mul();
		ref.div();
	}
}

public class LaunchCalculator {
	public static void main(String[] args) {
		MyCalculator1 mc1 = new MyCalculator1();
		MyCalculator2 mc2 = new MyCalculator2();
		MyCalculator3 mc3 = new MyCalculator3();
		
		Demo d = new Demo();
		d.permit(mc1);
		d.permit(mc2);
		d.permit(mc3);
	}
}
