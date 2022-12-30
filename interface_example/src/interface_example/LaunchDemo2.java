package interface_example;

interface MyInterface11{
	void add();
	
	static void fun() {
		System.out.println("I am inside MyInterface1");
	}
}

interface MyInterface22{
	void sub();
	
	static void fun() {
		System.out.println("I am inside MyInterface2");
	}
}

class MyClass11 implements MyInterface1, MyInterface2{
	public void add() {
		System.out.println("I am inside add method");
	}
	
	public void sub() {
		System.out.println("I am inside sub method");
	}
	
	public void fun() {
		System.out.println("I am inside My Class");
	}
}

public class LaunchDemo2 {

	public static void main(String[] args) {
		MyInterface11.fun();
		MyInterface22.fun();
		MyClass11 mc = new MyClass11();
		mc.add();
		mc.sub();
		mc.fun();
	}

}