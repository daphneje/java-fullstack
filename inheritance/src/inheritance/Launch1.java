package inheritance;

class Demo1{
	int a = 10;
}

class Demo2 extends Demo1{
	int a=100;
	void disp() {
		int a = 1000;
		
		System.out.println(a); // 1000
		System.out.println(this.a); // 100 - "this" keyword refers to instance variable
		System.out.println(super.a); // 10 - "super" keyword refers to parent variable
	}
	
}

public class Launch1 {
	public static void main(String[] args) {
		Demo2 x = new Demo2();
		x.disp();
	}
}
