package inheritance;

//class Demo8{
//	void fun() {
//		System.out.println("I am inside parent class");
//	}
//	
//	void myAccountBalanceIs() {
//		System.out.println("I have 1000");
//	}
//}
//
//class Demo9 extends Demo8{
//	void fun() {
//		System.out.println("I am inside child class");
//	}
//	
//	@Override
//	void myaccountBalanceIs() {
//		System.out.println("I have 2000");
//	}
//}
//
//public class LaunchDemo {
//	public static void main(String[] args) {
//		Demo9 x = new Demo9();
//		x.fun();
//		x.myAccountBalanceIs();
//	}
//}

class Animal1{
	
}

class Tiger1 extends Animal1{
	
}

class Demo8{
	Animal1 fun() {
		System.out.println("I am inside parent class");
		Animal1 a = new Animal1();
		return a;
	}
}

class Demo9 extends Demo8{
	Tiger1 fun() {
		System.out.println("I am inside child class");
		Tiger1 t = new Tiger1();
		return t;
	}
}

public class LaunchDemo {
	public static void main(String[] args) {
		Demo9 x = new Demo9();
		x.fun();
	}
}
