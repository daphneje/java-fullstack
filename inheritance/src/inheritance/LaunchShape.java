package inheritance;

abstract class Shape{
	float area;
	
	abstract void acceptInput();
	abstract void compute();
	
	void display() {
		System.out.println(area);
	}
}

class Triangle extends Shape{
	float base;
	float height;
}
public class LaunchShape {

}
