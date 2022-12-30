package inheritance;

//class Demo1{
//	private int a = 10;
//	private int b = 20;
//}
//
//class Demo2 extends Demo1{
//	void disp() {
//		
//		System.out.println(a);
//		System.out.println(b);	
//}
//
//public class Launch2 {
//	public static void main(String[] args) {
//		Demo2 x = new Demo2();
//		x.disp();
//	}
//}


class Demo3{
	int a = 10;
	int b = 20;
}

class Demo4 extends Demo3{
	void disp() {
		
		System.out.println(a);
		System.out.println(b);	
	}
}
	
class Demo5 extends Demo4{
	void disp() {
			
		System.out.println(a);
		System.out.println(b);	
	}
}

public class Launch2 {
	public static void main(String[] args) {
		Demo5 x = new Demo5();
		x.disp();
	}
}