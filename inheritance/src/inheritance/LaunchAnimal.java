package inheritance;

class Animal{
	void eat() {
		System.out.println("Animal eats");
	}
	
	void sleep() {
		System.out.println("Animal sleeps");
	}
	
	void food() {
		System.out.println("Animal's diet");
	}
}

class Tiger extends Animal{
	void eat() {
		System.out.println("Tiger hunts and eats");
	}
	
	void food() {
		System.out.println("Tiger is a carnivore");
	}
}

class Deer extends Animal{
	void eat() {
		System.out.println("Deer grazes and eats");
	}
	
	void food() {
		System.out.println("Deer is a herbivore");
	}
}

class Monkey extends Animal{
	void eat() {
		System.out.println("Monkey picks and eats");
	}
	
	void food() {
		System.out.println("Monkey is a omnivore");
	}
}

class Forest{
	void permit(Animal ref) {
		ref.eat();
		ref.sleep();
		ref.food();
	}
}

public class LaunchAnimal {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();
		Forest f = new Forest();
		
		f.permit(t);
		f.permit(d);
		f.permit(m);
	}
}
