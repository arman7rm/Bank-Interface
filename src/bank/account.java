package bank;
import java.util.Scanner;

public class account {
	Scanner in = new Scanner(System.in);
	Scanner x = new Scanner(System.in);

	private int balance=0;
	String password;
	
	account(){
		this.balance = 0;
		System.out.println("Now, create a password: ");
		String password = x.nextLine();
		this.password = password;
	}
	
	public void  displayMenu() {
		int power = 0;
		while (power<1) {
			System.out.println("What would you like to do?");
			System.out.println("1: View Balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: Delete Account");
			System.out.println("5: Log Out");
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				getBalance();
				continue;
			case 2:
				withdraw();
				continue;
			case 3:
				deposit();
				continue;
			case 4:
				this.password = null;
				continue;
			case 5:
				power +=1;

			}
	
		}
	}
	
	public String checkPassword() {
		return this.password;
	}
	

	public void getBalance() {
		System.out.println("Current Balance: " + balance);
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit() {
		System.out.print("How much would you like to deposit? : ");
		int amount = in.nextInt();
		if (amount <= 0)

            System.out.println("Can't deposit nonpositive amount.");

       else {

            balance += amount;

            System.out.println("$" + amount + " has been deposited.");

       }
		
	}
	public void withdraw() {
		System.out.print("How much would you like to withdraw? : ");
		int amount = in.nextInt();
		if (amount <= 0 || amount>balance)

            System.out.println("Can't withdraw this amount.");

       else {

            balance -= amount;

            System.out.println("$" + amount + " has been withdrawn.");

       }
		
}
}
