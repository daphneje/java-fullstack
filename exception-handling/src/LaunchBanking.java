import java.util.Scanner;

class InvalidCredentialsException extends Exception{
	public String getMessage() {
		return "Sorry, you have entered wrong credentials";
	}
}

class ATM {
	int un;
	int pw;
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your user name");
		un = scan.nextInt();
		System.out.println("Enter your password");
		pw = scan.nextInt();
	}
	
	void verify(int userName, int password) throws InvalidCredentialsException{
		if (userName==un && password==pw) {
			System.out.println("Collect your money");
		} else {
			InvalidCredentialsException ice = new InvalidCredentialsException();
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
}


class Bank1{
	int userName = 1111;
	int password = 2222;
	
	void initiate(){
		ATM atm = new ATM();
		
		try {
			atm.acceptInput();
			atm.verify(userName, password);
		} 
		catch(InvalidCredentialsException ice) {
			System.out.println(ice.getMessage() + " - Message dislayed on bank system");
			try {
				atm.acceptInput();
				atm.verify(userName, password);
			} 
			catch (InvalidCredentialsException ice1) {
				System.out.println(ice1.getMessage() + " - Message dislayed on bank system");
				try {
					atm.acceptInput();
					atm.verify(userName, password);
				} 
				catch (InvalidCredentialsException ice2) {
					System.out.println(ice2.getMessage() + " - Message dislayed on bank system");
					System.out.println("Your card is blocked. Please visit the bank.");
				}
			}
		}
	}
}


public class LaunchBanking {

	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.initiate();
	}

}
