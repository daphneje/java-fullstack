import java.util.Scanner;

class InvalidUsernamePasswordException extends Exception{
	public String getMessage() {
		return "You have exceeded the maximum number of tries and your card has been blocked. Please proceed to the bank to unlock.";
	}
}

class User{
	
	int username;
	int password;
//	int attempts = 3;
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username:");
		username = scan.nextInt();
		System.out.println("Enter your password:");
		password = scan.nextInt();
	}
	
	void verify() throws InvalidUsernamePasswordException{
		int attempts;
			
		for(attempts=2; attempts>=0; attempts--) {	
			if(username==1111 && password==2222) {
				System.out.println("Login success.");
				break;
			} 
			else {
				if(attempts>0) {
					System.out.println(" You have "+ attempts + " more try/tries." + " Message displayed on ATM");
					acceptInput();
				}
				else {
					InvalidUsernamePasswordException iupe = new InvalidUsernamePasswordException();
					System.out.println(iupe.getMessage() + " Message displayed on ATM");
					throw iupe;
				}
			}

		}
		
	}
}

class Bank{
	void initiate() {
		User u = new User();
		try {
			u.acceptInput();
			u.verify();
		}
		catch(InvalidUsernamePasswordException iupe) {
			System.out.println(iupe.getMessage() + " Message displayed on Bank's system");
		}
	}
}

public class LaunchBankApp {
	public static void main(String[] args) {
	Bank b = new Bank();
	b.initiate();
	}
}
