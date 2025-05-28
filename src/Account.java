
public class Account {

	// fields
	private String accNumber;
	private double balance = 1000000;
	private String customerName;
	private String eMail;
	private String phNumber;

	// constructor
	public Account() {
		// this() has to be the first statement in the constructor
		this("843537", 10000, "Default Name", "Default Address", "Default Phone");
		System.out.println("Welcome to the Bank Account System!");
	}

	public Account(String accNumber, double balance, String customerName, String email, String phone) {
		this.accNumber = accNumber;
		this.balance = balance;
		this.customerName = customerName;
		eMail = email;
		phNumber = phone;
	}

	// depositing funds
	public void depositFunds(double depositAmount) {
		balance += depositAmount;
		System.out.println("Deposit of ₹" + depositAmount + " made.\nCurrent Balance: ₹" + this.balance);
	}

	public void withdrawFunds(double withdrawlAmount) {
		if (balance - withdrawlAmount < 0) {
			System.out.println("Insufficient Funds! You only have ₹" + balance + " in your account.");
		} else {
			balance -= withdrawlAmount;
			System.out.println("Withdrawl of ₹" + withdrawlAmount + " was processed.\nRemaining balance: ₹" + balance);
		}
	}

	// getters
	public String getaccNumber() {
		return accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return eMail;
	}

	public String getPhNo() {
		return phNumber;
	}

	// setters
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public void setBalance(int balance) {

	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setEmail(String eMail) {
		this.eMail = eMail;
	}

	public void setPhNo(String phNumber) {
		this.phNumber = phNumber;
	}
}