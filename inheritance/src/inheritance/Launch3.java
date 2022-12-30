package inheritance;


class Demo6{
	int a, b;
	
	Demo6(){
		// super() will be included automatically by compiler, super() will call the object class (the parent class)
		this(1000, 2000);
		a=10;
		b=20;
	}
	
	Demo6(int a, int b){
		super();
		this.a=a;
		this.b=b;
	}
}

class Demo7 extends Demo6{
	int c, d;
	
	Demo7(){
		// super() will be included automatically by compiler, super() will call the the parent class
		c=11;
		d=22;
	}
	
	Demo7(int c, int d){
//		super(111, 222);
		this(); // this() calls another constructor within the same class
		this.c=c;
		this.d=d;
	}
	
	void disp() {
		System.out.println(a);
		System.out.println(b);	
		System.out.println(c);
		System.out.println(d);	
	}
}

public class Launch3 {
	public static void main(String[] args) {
		Demo7 x = new Demo7(100, 200);
		x.disp();
	}
}
