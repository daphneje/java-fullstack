package interface_example;

interface MyInterface1{
	void add();
	
	default void fun() {
		System.out.println("I am inside MyInterface1");
	}
}

interface MyInterface2{
	void sub();
	
	default void fun() {
		System.out.println("I am inside MyInterface2");
	}
}

class MyClass implements MyInterface1, MyInterface2{
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

public class LaunchExmp {

	public static void main(String[] args) {

	}

}