package billingsystem;

import java.util.Scanner;

class Bill{
	String itemName;
	int itemPrice;
	int quantity;
	int subTotal;
	
	public Bill(String itemName, int itemPrice, int quantity, int subTotal) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}
	
	public String toString() {
		return itemName+"     " + itemPrice+ "     " + quantity+"     " + subTotal;
	}
	
}

public class LaunchBillingSystem {
	public static void main(String[] args) {
		int itemID;
		String itemName;
		int quantity;
		int itemPrice;
		int subTotal;
		
		System.out.println("Welcome to our hotel!");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name.");
		String name = scan.nextLine();
		System.out.println("Dear " + name + ", the menu is as follow:");
		System.out.println("______________________________________________");
		System.out.println("Item ID          Item Name          Item Price");
		System.out.println("______________________________________________");
		System.out.println("1                Water              10");
		System.out.println("2                Pepsi              25");
		System.out.println("3                Pizza              50");
		System.out.println("4                Fries              35");
		System.out.println("5                Burger             40");
		System.out.println("______________________________________________");
		
		System.out.println("Please enter the item ID");
		itemID = scan.nextInt();
		
		System.out.println("Please enter quantity");
		quantity = scan.nextInt();
		
		switch(itemID) {
		case 1: itemName = "Water";
				itemPrice = 10;
				subTotal = itemPrice*quantity;
		case 2: itemName = "Pepsi";
				itemPrice = 25;
				subTotal = itemPrice*quantity;
		case 3: itemName = "Pizza";
				itemPrice = 50;
				subTotal = itemPrice*quantity;
		case 4: itemName = "Fries";
				itemPrice = 35;
				subTotal = itemPrice*quantity;
		case 5: itemName = "Burger";
				itemPrice = 40;
				subTotal = itemPrice*quantity;
		}
		
	}
}


//class MenuItem{
//	
//	public MenuItem[] arr;
//	public int itemID;
//	public String itemName;
//	public int itemPrice;
//	
//	MenuItem(int itemID, String itemName, int itemPrice) {
//		this.itemID = itemID;
//		this.itemName = itemName;
//		this.itemPrice = itemPrice;
//	}
//	
//	void addMenuItem() {
//		arr = new MenuItem[5];
//		
//		arr[0] = new MenuItem(1, "Water", 10);
//		arr[1] = new MenuItem(2, "Pepsi", 25);
//		arr[2] = new MenuItem(3, "Pizza", 50);
//		arr[3] = new MenuItem(4, "Fries", 35);
//		arr[4] = new MenuItem(5, "Burger", 60);
//	}
//	
//	public void displayMenu() {
//		addMenuItem();
//		System.out.println("________________________________________ \nItem ID          Item Name          Item Price \n________________________________________");
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i].itemID + "                 " + arr[i].itemName + "                   " + arr[i].itemPrice);
//		}
//	}
//}

//public class LaunchBillingSystem {
//public static void main(String[] args) {
//	arr.displayMenu();
//}
//}

//class Order{
//	String name;
//	String itemName;
//	int itemPrice;
//	int quantity;
//	int subtotal;
//	int total;
//	
//	void greeting() {
//		System.out.println("Welcome to our hotel!");
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Dear guest, what's your name?");
//		name = scan.nextLine();
//	}
//	
//	void displayMenu(){
//		System.out.println("Dear " + name + ", the menu is as follow:");
//		
//		
//		
//	}
//	
//	void displaySubBill() {
//		
//	}
//	
//	void displayFinalBill() {
//		
//	}
//}
//
//public class LaunchBillingSystem {
//	public static void main(String[] args) {
//		Order o = new Order();
//		o.greeting();
//		o.displayMenu();
//	}
//}


// use array list or hash map


//public class LaunchBillingSystem {
//public double subTotal;
//public static double runningTotal;
//private static double itemPrice;
//static boolean ordering = true;
//static Scanner input = new Scanner(System.in);
//public static void menu(){
//    System.out.println("Welcome \n1. Burger ($2.00) \n2. Fries ($1.50)\n3. Soda ($1.00) \n4. Done");
//}
//public static double itemPrice(int foodItem) {
//    if (foodItem == 1) {
//        //burger= $2.00
//        System.out.println("You've ordered a burger");
//        itemPrice = 2.00;
//    }
//    if (foodItem == 2) {
//        //fries = $1.50
//        System.out.println("You've ordered fries");
//        itemPrice = 1.50;
//    }
//    if (foodItem == 3) {
//        //soda = $1.00
//        System.out.println("You've ordered a soda");
//        itemPrice = 1.00;
//    }
//    quantity();
//    return itemPrice;
//}
//public static double quantity() {
//    System.out.println("Enter quantity");       
//    double quantity = input.nextDouble();
//    subTotal(quantity, itemPrice);
//    return quantity;
// }
//public static double subTotal(double quantity, double itemPrice) {
//    double subTotal = quantity*itemPrice;
//    System.out.println("Subtotal: "+ subTotal);
//    runningTotal += subTotal;
//    return subTotal;
//}
//public static void done(){
//    ordering = false;
//    System.out.println(runningTotal);
//    System.out.println("Enjoy your meal");
//}
//public static void main(String[] args) {
//    int menuOption;
//    int foodItem = 0;
//    input = new Scanner(System.in); 
//    do{
//        double runningTotal=0;
//        menu();
//        menuOption = input.nextInt();    
//        switch(menuOption){
//            case 1:
//                foodItem = 1;
//                itemPrice(foodItem);
//                break;
//            case 2:
//                foodItem = 2;
//                itemPrice(foodItem);
//                break;
//            case 3:
//                foodItem = 3;
//                itemPrice(foodItem);
//                break;
//            case 4:
//                done();
//                break;      
//            default:
//                System.out.println("Invalid option.");
//        }
//
//    } while(ordering); {
//}
//}
//}



//public class LaunchBillingSystem {
//    public double subTotal;
//    public static double runningTotal;
//    private static double itemPrice;
//    static boolean ordering = true;
//    static Scanner input = new Scanner(System.in);
//
//    public static void menu() {
//        System.out.println("Welcome \n1. Burger ($2.00) \n2. Fries ($1.50)\n3. Soda ($1.00) \n4. Done");
//    }
//
//    public static double itemPrice(int foodItem) {
//        if (foodItem == 1) {
//            // burger= $2.00
//            System.out.println("You've ordered a burger");
//            itemPrice = 2.00;
//        }
//        if (foodItem == 2) {
//            // fries = $1.50
//            System.out.println("You've ordered fries");
//            itemPrice = 1.50;
//        }
//        if (foodItem == 3) {
//            // soda = $1.00
//            System.out.println("You've ordered a soda");
//            itemPrice = 1.00;
//        }
//        quantity();
//        return itemPrice;
//    }
//
//    public static double quantity() {
//        System.out.println("Enter quantity");
//        double quantity = input.nextDouble();
//        subTotal(quantity, itemPrice);
//        return quantity;
//    }
//
//    public static double subTotal(double quantity, double itemPrice) {
//        double subTotal = quantity * itemPrice;
//        System.out.println("Subtotal: " + subTotal);
//        return subTotal;
//    }
//
//    public static void done(double runningTotal) {
//        ordering = false;
//        System.out.println(runningTotal);
//        System.out.println("Enjoy your meal");
//    }
//    
//    public static void main(String[] args) {
//    	  int menuOption;
//    	  int foodItem = 0;
//    	  input = new Scanner(System.in);
//    	  double runningTotal=0;
//    	  do{
//    	    menu();
//    	    menuOption = input.nextInt();
//    	    switch(menuOption){
//    	      case 1:
//    	        foodItem = 1;
//    	        runningTotal += itemPrice(foodItem);
//    	        break;
//    	      case 2:
//    	        foodItem = 2;
//    	        runningTotal += itemPrice(foodItem);
//    	        break;
//    	      case 3:
//    	        foodItem = 3;
//    	        runningTotal += itemPrice(foodItem);
//    	        break;
//    	      case 4:
//    	        done(runningTotal);
//    	        break;
//    	      default:
//    	        System.out.println("Invalid option.");
//    	    }
//    	  } while(ordering);
//    	  System.out.println("Total amount: " + runningTotal);
//    	}
//}


//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class LaunchBillingSystem {
//	public static void main(String[] args) {
//		int itemID=0;
//		String itemName=null;
//		int quantity=0;
//		int itemPrice=0;
//		int subTotal=0;
//		String choice = "y";
//		int grandTotal=0;
//		
//		ArrayList<Bill> newItem = new ArrayList<Bill>();
//		
//		System.out.println("Dear customer, welcome to xyz hotel");
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter your name");
//		String name = scan.nextLine();
//		
//		while(choice.equals("y")) {
//			System.out.println("Dear "+ name+", below is the menu");
//			System.out.println("______________________________________________________");
//			System.out.println("ItemID		ItemName		ItemPrice");
//			System.out.println("______________________________________________________");
//			System.out.println("1		Water			10");
//			System.out.println("2		Pepsi			25");
//			System.out.println("3		Pizza			50");
//			System.out.println("4		Fries			35");
//			System.out.println("5		Burger			40");
//			System.out.println("______________________________________________________");
//			
//			System.out.println("Please enter the item ID");
//			itemID = scan.nextInt();
//			
//			System.out.println("Please enter the quantity");
//			quantity = scan.nextInt();
//			
//			switch(itemID) {
//			case 1:itemName = "Water";
//					itemPrice = 10;
//					subTotal = itemPrice*quantity;
//					break;
//			case 2:itemName = "Pepsi";
//					itemPrice = 25;
//					subTotal = itemPrice*quantity;
//					break;
//			case 3:itemName = "Pizza";
//					itemPrice = 50;
//					subTotal = itemPrice*quantity;
//					break;
//			case 4:itemName = "Fries";
//					itemPrice = 35;
//					subTotal = itemPrice*quantity;
//					break;
//			case 5:itemName = "Burger";
//					itemPrice = 40;
//					subTotal = itemPrice*quantity;
//					break;
//			default:System.out.println("Invalid selection");
//					break;
//			}
//			System.out.println(itemName+"      "+itemPrice+"      "+quantity+"      "+subTotal);
//			grandTotal += subTotal;
//			newItem.add(new Bill(itemName, itemPrice, quantity, subTotal));
//			System.out.println("Do you want to order more(y/n)");
//			choice = scan.next();
//		}
//		System.out.println("___________________________________");
//		System.out.println("Item name    Item Price    quantity    Sub Total");
//		System.out.println("___________________________________");
//		for(Bill x:newItem) {
//			System.out.println(x);
//		}
//		System.out.println("___________________________________");
//		System.out.println("Dear "+name+", your total bill is "+grandTotal);
//		System.out.println("___________________________________");
//	}
//}
//
//
//class Bill{
//	String itemName;
//	int itemPrice;
//	int quantity;
//	int subTotal;
//	
//	public Bill(String itemName, int itemPrice, int quantity, int subTotal) {
//		super();
//		this.itemName = itemName;
//		this.itemPrice = itemPrice;
//		this.quantity = quantity;
//		this.subTotal = subTotal;
//	}
//
//	@Override
//	public String toString() {
//		return itemName+"        "+itemPrice+"        "+quantity+"        "+subTotal;
//	}	
//	
//	
//}