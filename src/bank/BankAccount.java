package bank;
import java.util.Scanner;

import java.util.HashMap;

public class BankAccount {

	static HashMap<String, account> bank_accounts = new HashMap<String, account>();
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Scanner strng = new Scanner(System.in);
            int userChoice;
            boolean quit = false;
            int first=0;
            do {	
            	  System.out.println(new String(new char[30]).replace("\0", " ") + "Welcome to LO-Fi Amazon Bank! \n");
                  System.out.println("1. Login");
                  System.out.println("2. Create Account");
                  System.out.println("3. Quit");
                  System.out.print("\nPlease choose an option: ");
                  userChoice = in.nextInt();
                  switch (userChoice) {
                  case 1:
                	if(first==0) {
                		System.out.println("\nNo accounts exist! You must first create an account.");
                		break;
                	}
                	Scanner a = new Scanner(System.in);
              		System.out.print("Username: ");
              		String name = a.nextLine();
              		System.out.print("\nPassword: ");
              		String pass = a.nextLine();
              		if (bank_accounts.get(name).checkPassword().equals(pass)) {
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
              					bank_accounts.get(name).getBalance();
              					continue;
              				case 2:
              					bank_accounts.get(name).withdraw();
              					continue;
              				case 3:
              					bank_accounts.get(name).deposit();
              					continue;
              				case 4:
              					bank_accounts.get(name).password = null;
              					continue;
              				case 5:
              					power +=1;

              				}
              			}
              			break;
              		}
	              	System.out.println("Uh-oh, username and password does not match, please try again.");
	              	break;
                  case 2:
                	  	first++;
                	  	System.out.println("Thank you for choosing Arman. First, pick a username: ");
  						String user = strng.nextLine();
  	            	    System.out.println(new String(new char[30]).replace("\0", " ") + "What kind of account would you like to create? \n");
  	            	    System.out.println("1. Checkings\n2. Savings");
  	            	    String type = strng.nextLine();
  	            	    if(type.equals("1")) {
  	  						checkings account = new checkings();
  	  						bank_accounts.put(user, account);
  	            	    	
  	            	    }else if (type.equals("2")) {
  	            	    	
  	            	    }else {
  	            	    	System.out.println("Wrong Answer.");
  	            	    	break;
  	            	    }
  						System.out.println("\nAccount Created! ");
                	  break;
                  case 3:
                        quit = true;
                        break;
                  default:
                        System.out.println("Wrong choice.");
                        break;
                  }

                  System.out.println();

            } while (!quit);

            System.out.println("Good Bye!");

      }

}