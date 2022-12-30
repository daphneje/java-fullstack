import java.util.Scanner;

class Customer extends Thread{
	public void run() {
		if(getName().equals("PURCHASE")) {
			purchase();
		}
		else {
			decline();
		}
	}
}

class Counter{
	
	int remainingTickets = 5;
	int requestedTickets;
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of tickets you would like:");
		requestedTickets = scan.nextInt();
	}
	
	void verify() {
			if(remainingTickets >= requestedTickets) {
				remainingTickets = remainingTickets - requestedTickets;
				System.out.println("Purchase Successful");
			} 
			
			else {
				System.out.println("Purchase declined, insufficient tickets remaining.");
				}
	}
}

public class LaunchTicketBooking {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		
		c1.setName("C1");
		c2.setName("C2");
		
		c1.start();
		c2.start();
	}

}

