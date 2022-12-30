package inheritance;

abstract class Plane{
	abstract void takeOff();
	abstract void fly() ;
	abstract void land();
}

class PassengerPlane extends Plane{
	void takeOff() {
		System.out.println("Passenger Plane takes off from medium sized run way");
	}
	
	void fly() {
		System.out.println("Passenger Plane flies at low heights");
	}
	
	void land() {
		System.out.println("Passenger Plane land on medium sized run way");
	}
}

class CargoPlane extends Plane{
	void takeOff() {
		System.out.println("Cargo Plane takes off from longer sized run way");
	}
	
	void fly() {
		System.out.println("Cargo Plane flies at medium heights");
	}
	
	void land() {
		System.out.println("Cargo Plane lands on longer sized run way");
	}
}

class FighterPlane extends Plane{
	void takeOff() {
		System.out.println("Fighter Plane takes off from smaller sized run way");
	}
	
	void fly() {
		System.out.println("Fighter Plane flies at high heights");
	}
	
	void land() {
		System.out.println("Fighter Plane lands on smaller sized run way");
	}
}

class Airport{
	void permit(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
	}
}

public class LaunchPlane {
	public static void main(String[] args) {
		PassengerPlane pp = new PassengerPlane();
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		Airport a = new Airport();
		a.permit(pp);
		a.permit(cp);
		a.permit(fp);
		
		
//class Plane{
//	void takeOff() {
//		System.out.println("Plane is taking off");
//	}
//	
//	void fly() {
//		System.out.println("Plane is flying");
//	}
//	
//	void land() {
//		System.out.println("Plane is landing");
//	}
//}
//
//class PassengerPlane extends Plane{
//	void fly() {
//		System.out.println("Passenger Plane flies at low heights");
//	}
//	
//	void carryPassenger() {
//		System.out.println("Passenger Plane carry the passengeres");
//	}
//}
//
//class CargoPlane extends Plane{
//	void fly() {
//		System.out.println("Cargo Plane flies at medium heights");
//	}
//	
//	void carryCargo() {
//		System.out.println("Cargo Plane carry the goods");
//	}
//}
//
//class FighterPlane extends Plane{
//	void fly() {
//		System.out.println("Fighter Plane flies at high heights");
//	}
//	
//	void carryArms() {
//		System.out.println("Fighter Plane carry the arms");
//	}
//}
//
//class Airport{
//	void permit(Plane p) {
//		p.takeOff();
//		p.fly();
//		p.land();
//	}
//}
//
//public class LaunchPlane {
//	public static void main(String[] args) {
//		PassengerPlane pp = new PassengerPlane();
//		CargoPlane cp = new CargoPlane();
//		FighterPlane fp = new FighterPlane();
//		Airport a = new Airport();
//		a.permit(pp);
//		a.permit(cp);
//		a.permit(fp);
//		
//		
//		PassengerPlane pp = new PassengerPlane();
//		CargoPlane cp = new CargoPlane();
//		FighterPlane fp = new FighterPlane();
//		Plane p;
//		
//		p=pp;
//		p.takeOff();
//		p.fly();
//		p.land();
//		((PassengerPlane)(p)).carryPassenger();
//		
//		p=cp;
//		p.takeOff();
//		p.fly();
//		p.land();
//		((CargoPlane)(p)).carryCargo();
//		
//		p=fp;
//		p.takeOff();
//		p.fly();
//		p.land();
//		((FighterPlane)(p)).carryArms();

		
//		PassengerPlane pp = new PassengerPlane();
//		CargoPlane cp = new CargoPlane();
//		FighterPlane fp = new FighterPlane();
//		
//		pp.takeOff();
//		pp.fly();
//		pp.land();
//		pp.carryPassenger();
//		
//		cp.takeOff();
//		cp.fly();
//		cp.land();
//		cp.carryCargo();
//		
//		fp.takeOff();
//		fp.fly();
//		fp.land();
//		fp.carryArms();
	}
}
