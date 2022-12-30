import java.util.Scanner;

class Demo{
	void fun() throws ArithmeticException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a = scan.nextInt();
		System.out.println("Enter the denominator");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
	}
}

public class Launch2 {
	public static void main(String[] args) {
	System.out.println("Connection1 established");
	try {
		Demo d = new Demo();
		d.fun();
	}
	catch (ArithmeticException e) {
		System.out.println("Problem resolved in main");
	}
	System.out.println("Connection1 terminated");
	}
}
