import java.util.*;
import java.util.Scanner;

class Demo1{
	void fun1() throws ArithmeticException, InputMismatchException {
		System.out.println("Connection2 established");
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = scan.nextInt();
			System.out.println("Enter the denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Problem resolved in fun1 - ArithmeticException e");
			throw e;
		}
		
		catch(InputMismatchException e) {
			System.out.println("Problem resolved in fun1 - InputMismatchException e");
			throw e;
		}
		
		finally {
			System.out.println("Connection2 terminated");
		}

	}
}

public class Launch {
	public static void main(String[] args) {
	System.out.println("Connection1 established");
	
	try {
		Demo1 d1 = new Demo1();
		d1.fun1();
	}
	catch (ArithmeticException e) {
		System.out.println("Problem resolved in main - ArithmeticException");
	}
	
	catch (InputMismatchException e) {
		System.out.println("Problem resolved in main - InputMismatchException");
	}
	System.out.println("Connection1 terminated");
	}
}
