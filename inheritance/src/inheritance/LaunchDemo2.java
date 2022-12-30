package inheritance;

abstract class Demo10{ //can't create an object from abstract class, only reference
	abstract void fun1();
	abstract void fun2();
}

class Demo11 extends Demo10{
	void fun1() {
		System.out.println("Inside fun1");
	}
	
	void fun2() {
		System.out.println("Inside fun2");
	}
}

public class LaunchDemo2 {
	public static void main(String[] args) {
		Demo10 x1;
		Demo11 x = new Demo11();
		x.fun1();
		x.fun2();
	}
}
