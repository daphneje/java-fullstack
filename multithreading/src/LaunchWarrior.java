class Warrior extends Thread {
	String resource1 = "knife";
	String resource2 = "gun";
	String resource3 = "bomb";
	// String s = "resource", object created in constant pool where duplicates are not permitted
	// Unless create using new keyword, object is created outside constant pool then duplicates are permitted in the heap

	public void run() {
		if (getName().equals("RAMU")) {
			ramuAccResources();
		} 
		else {
			rajuAccResources();
		}
	}

	void ramuAccResources() {
		try {
			synchronized (resource1) {
				System.out.println("Ramu has accquired " + resource1);
				Thread.sleep(4000);
				synchronized (resource2) {
					System.out.println("Ramu has accquired " + resource2);
					Thread.sleep(4000);
					synchronized (resource3) {
						System.out.println("Ramu has accquired " + resource3);
						Thread.sleep(4000);
					}
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	void rajuAccResources() {
		try {
			synchronized (resource3) {
				System.out.println("Raju has accquired " + resource3);
				Thread.sleep(4000);
				synchronized (resource2) {
					System.out.println("Raju has accquired " + resource2);
					Thread.sleep(4000);
					synchronized (resource1) {
						System.out.println("Raju has accquired " + resource1);
						Thread.sleep(4000);
					}
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class LaunchWarrior {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();

		w1.setName("RAMU");
		w2.setName("RAJU");

		w1.start();
		w2.start();
	}

}