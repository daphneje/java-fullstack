package classexercise;

//class Dog {  
//	String name;  
//	String color;
//	static int count = 0;
//
//	Dog(String name, String color) {  
//		this.name = name;  
//		this.color = color;  
//		count++;  
//		}  
//}  
//
//public class LaunchDog {  
//	public static void main(String args[]) {  
//		//creating objects      
//		Dog d1 = new Dog("A", "white");  
//		System.out.println ("There are " + Dog.count + " objects in this class.");  
//		Dog d2 = new Dog("B", "black");  
//		System.out.println ("There are " + Dog.count + " objects in this class.");  
//		Dog d3 = new Dog("C", "gold");  
//		System.out.println ("There are " + Dog.count + " objects in this class.");  
//		Dog d4 = new Dog("D", "brown");  
//		System.out.println ("There are " + Dog.count + " objects in this class.");  
//	}  
//}  





//class Dog {
//	String name;
//	String color;
//	int cost;
//	static int count;
//	
//	Dog(){
//		count++;
//	}
//	
//	Dog(String name){
//		count++;
//	}
//	
//	Dog(String name, String color){
//		count++;
//	}
//	
//	Dog(String name, String color, int cost){
//		count++;
//	}
//}
//
//public class LaunchDog {
//	public static void main(String[] args) {
//		System.out.println(Dog.count);
//		Dog d1 = new Dog();
//		System.out.println(Dog.count);
//		Dog d2 = new Dog("A");
//		System.out.println(Dog.count);
//		Dog d3 = new Dog("A", "White");
//		System.out.println(Dog.count);
//		Dog d4 = new Dog("B", "Black");
//		System.out.println(Dog.count);
//		Dog d5 = new Dog("C", "Gold");
//		System.out.println(Dog.count);
//	}
//}





class Dog {
	String name;
	String color;
	int cost;
	static int count;
	
	{
		count++;
	}
	
	Dog(){

	}
	
	Dog(String name){
	}
	
	Dog(String name, String color){
	}
	
	Dog(String name, String color, int cost){
	}
}

public class LaunchDog {
	public static void main(String[] args) {
		System.out.println(Dog.count);
		Dog d1 = new Dog();
		System.out.println(Dog.count);
		Dog d2 = new Dog("A");
		System.out.println(Dog.count);
		Dog d3 = new Dog("A", "White");
		System.out.println(Dog.count);
		Dog d4 = new Dog("B", "Black");
		System.out.println(Dog.count);
		Dog d5 = new Dog("C", "Gold");
		System.out.println(Dog.count);
	}
}