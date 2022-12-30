package inheritanceproject;

import java.util.Scanner;

// The program is to shore inheritance where a new AddStore child class is extended from StoreDetails parent class.
// The idea is that user can add a new store information to an existing mall directory.

abstract class StoreDetails{
	
	String storeName;
	String category;
	int unitNumber;
	String mallAddress= "123 SG Ave, Singapore 123456";
	String openingHours;
	String choice;
	

	abstract void acceptInput();
	abstract void displayData();
}

class AddStore extends StoreDetails{
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the store name");
		storeName = scan.nextLine();
		
		System.out.println("Enter the store category");
		category = scan.nextLine();
		
		System.out.println("Enter the unit Number");
		unitNumber = scan.nextInt();
		
		System.out.println("Is the opening hours same as the mall opening hours? (y/n)");
		choice = scan.next();
		openingHours = scan.nextLine();
		
		if(choice.equals("y")) {
			openingHours="11AM - 10PM";
		}
		else if(choice.equals("n")){
			System.out.println("Enter the opening hours");
			openingHours = scan.nextLine(); // Unable to capture the input on this line unless added the same line on Line38, would like to check with you on this.
		}
		else {
			System.out.println("Invalid Input");
			openingHours = null;
		}
		
	}
	
	void displayData() {
		System.out.println("Store Name: " + storeName);
		System.out.println("Category: " + category);
		System.out.println("Unit Number: " + unitNumber);
		System.out.println("Address: " + mallAddress);
		System.out.println("Opening Hours: " + openingHours);
	}
}

class ShoppingMall{
	void permit(StoreDetails ref) {
		ref.acceptInput();
		ref.displayData();
	}
}

public class MallDirectory {
	public static void main(String[] args) {
		AddStore store1 = new AddStore();
		ShoppingMall s = new ShoppingMall();
		
		s.permit(store1);
	}
}
