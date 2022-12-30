package datatypes;

class Fan{
	int numberOfWings = 3;
	String Color = "brown";
	int cost = 500;
	
	void rotate() {
		System.out.println("Fan rotates");
	}
	
	void stop() {
		System.out.println("Fan stops rotating");
	}
	
	void blowAir() {
		System.out.println("Fan blows air");
	}
}

public class LaunchFan {
	public static void main(String[] args) {
		Fan f1 = new Fan();
		f1.rotate();
		f1.stop();
		f1.blowAir();
	}

}
