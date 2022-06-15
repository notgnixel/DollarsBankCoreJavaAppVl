import java.util.Scanner;

public class DollarsBankController {
	Scanner scan = new Scanner(System.in);
	
	static void createNewAccount() {
		System.out.println("Customer Name:");
		String customerName = scan.nextLine();
		System.out.println("Customer Address:");
		String customerAddy = scan.nextLine();
		System.out.println("Customer Contact Number:");
		String customerNumber = scan.nextLine();
		System.out.println("User Id : ");
		String customerID = scan.nextLine();
		System.out.println("Password : 8 Characters With Lower, Upper & Special");
		String customerPasswd = scan.nextLine();
		System.out.println("Initial Deposit Amount");
		int initialDeposit = scan.nextInt();

		//TODO access Customer.java using parameters
		Customer newCustomer = new Customer();
		newCustomer(customerName,customerAddy,customerNumber,customerID,customerPasswd,initialDeposit);
	}

	static void login() {
		System.out.println("User Id : ");
		String userID = scan.nextLine();
		System.out.println("Password : ");
		String passwd = scan.nextLine();

		//TODO access account w/ Account.java parameters(userID & passwd)
		//TODO exception/check for non valid user/password input
	}

	static void exit() {
		System.out.print("Quit");
	}

	static void startUP(int option) {
		this.option = option;
		switch(option) {
		case 1:
			createNewAccount();
			break;
		case 2:
			login()
			break;
		case 3:
			exit()
		default:
			//TODO exception/check for wrong input
		}
	}

	public DollarsBankController	{
		System.out.println("1. Create New Account");
		System.out.println("2. Login");
		System.out.println("3. Exit");

		int option = scan.nextLine();
		startUP(option);
	}
}