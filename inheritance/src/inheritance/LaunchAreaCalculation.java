package inheritance;

import java.util.Scanner;

abstract class Shape{
	float area;
	abstract void acceptInput();
	abstract void areaCal();
}

class Triangle extends Shape{
	float base;
	float height;
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		base = scan.nextFloat();
		System.out.println("Enter the height of triangle");
		height = scan.nextFloat();
	}
	
	void areaCal() {
		area = 0.5f*base*height;
		System.out.println("Area of triangle: " + area);
	}
}

class Rectangle extends Shape{
	float length;
	float breadth;
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length rectangle");
		length = scan.nextFloat();
		System.out.println("Enter the breadth rectangle");
		breadth = scan.nextFloat();
	}
	
	void areaCal() {
		area = length*breadth;
		System.out.println("Area of rectangle: " + area);
	}
}

class Circle extends Shape{
	float pi;
	float radius;
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		radius = scan.nextFloat();
	}
	
	void areaCal() {
		area = 3.14159f*radius*radius;
		System.out.println("Area of circle: " + area);
	}
}

class AreaCalculation{
	void calculate(Shape s) {
		s.acceptInput();
		s.areaCal();
	}
}

public class LaunchAreaCalculation {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		AreaCalculation a = new AreaCalculation();
		a.calculate(t);
		a.calculate(r);
		a.calculate(c);
	}
}
		