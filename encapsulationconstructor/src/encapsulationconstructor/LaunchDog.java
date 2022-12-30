package encapsulationconstructor;

class Dog{
	private String name;
	private String color;
	private int cost;

	Dog(String name, String color, int cost) { 	// constructor 1
		// There's no this() method, super() will be included by compiler. Take note this() and super() must be on the first line, cannot have both at the same time.
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	
	Dog(String name){							// constructor 2
//		this("Lobo", "Black", 750);
		cost=1000;
	}
	
	Dog(){										// constructor 3
//	this("Ruby");
	color="white";
	cost=800;
}
	
	public void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
}

public class LaunchDog {
	public static void main(String[] args) {
		Dog d = new Dog(); 
		d.display();

	}
}


//class Dog{
//	private String name;
//	private String color;
//	private int cost;
//	
//	// Constructor
//	public Dog(String name, String color, int cost) {
//		this.name = name;
//		this.color = color;
//		this.cost = cost;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public String getColor() {
//		return color;
//	}
//	
//	public int getCost() {
//		return cost;
//	}
//}
//
//public class LaunchDog {
//	public static void main(String[] args) {
//		Dog d = new Dog("Ruby", "brown", 1000); // Constructor
//		System.out.println(d.getName());
//		System.out.println(d.getColor());
//		System.out.println(d.getCost());
//	}
//
//}


// -


//class Dog{
//	private String name;
//	private String color;
//	private int cost;
//
//	Dog(String name, String color, int cost) {
//		this.name = name;
//		this.color = color;
//		this.cost = cost;
//	}
//	
//	public void display() {
//		System.out.println(name);
//		System.out.println(color);
//		System.out.println(cost);
//	}
//}
//
//public class LaunchDog {
//	public static void main(String[] args) {
//		Dog d1 = new Dog("Ruby", "brown", 1000); 
//		d1.display();
//		Dog d2 = new Dog("Buddy", "white", 10000); 
//		d2.display();
//	}
//}


// -


//class Dog{
//	private String name;
//	private String color;
//	private int cost;
//
//	Dog(String name, String color, int cost) {
//		this(); // calling of other constructor
//	}
//	
//	Dog(){
//		name="Jimmy";
//		color="white";
//		cost=800;
//	}
//	
//	public void display() {
//		System.out.println(name);
//		System.out.println(color);
//		System.out.println(cost);
//	}
//}
//
//public class LaunchDog {
//	public static void main(String[] args) {
//		Dog d1 = new Dog("Ruby", "brown", 1000); 
//		d1.display();
//		Dog d2 = new Dog("Buddy", "gold", 10000); 
//		d2.display();
//	}
//}


// -



