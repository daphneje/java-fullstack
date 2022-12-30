package interface_example;

@FunctionalInterface
interface MyInterf{
	int add(int x, int y);
}

public class LaunchInterface {	
	public static void main(String[] args) {
		MyInterf ref = (x,y) -> x+y;
		System.out.println(ref.add(10,20));
	}
}

//class MyClass1 implements MyInterf{
//	public void fun()v{
//		System.out.println("I am inside fun method");
//
//	}
//}
//
//public class LaunchInterface {	
//	public static void main(String[] args) {
//		MyInterf ref = () -> System.out.println("I am inside ");
//	}
//)