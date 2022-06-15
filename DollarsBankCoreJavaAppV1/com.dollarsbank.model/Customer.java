
public class Customer {
	static void customerName(String name) {
		this.name = name; 
	}
	static void customerAddy(String address) {
		this.address = address;
	}
	static void customerNumber(int number) {
		this.number = number;
	}
	static void customerID(String userID) {
		this.userID = userID;
	}
	static void customerPasswd(String passwd){
		this.passwd = passwd;
	}
	static void customerInitialDeposit(int initialDeposit){
		this.passwd = passwd;
	}
	public Customer(String name, String address, String number, String userID, String passwd, int intialDeposit) {
		this.name = name; 
		this.address = address; 
		this.number = number; 
		this.userID = userID; 
		this.passwd = passwd;
		this.intialDeposit = intialDeposit; 

		LinkedList<String>  transaction = new LinkedList<String>();
		transaction.add("action #1");
		LinkedList<String> acctDetails = new LinkedList<String>();
		acctDetails.add(name);
		acctDetails.add(address);
		acctDetails.add(number);
		acctDetails.add(userID);
		acctDetails.add(passwd);
		acctDetails.add(intialDeposit);
		LinkedList<Integer> funds = new LinkedList<Integer>();
		
	}
}