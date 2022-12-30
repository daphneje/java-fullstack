package interface_example;

interface Calculator1{
	void add();
	void sub();
}

interface Calculator2{
	void mul();
	void div();
}

class MyCalculator implements Calculator1, Calculator2{
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

public class LaunchCalculator2 {
	public static void main(String[] args) {
			MyCalculator mc = new MyCalculator();
			Calculator1 c;

	}

}