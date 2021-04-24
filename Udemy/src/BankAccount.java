
public class BankAccount {
	private int phoneNo;
	private double balance;
	private String name, email, accountNo;
	public BankAccount() {
		System.out.println("Empty constructor called.");
	}
	public BankAccount(int phoneNo, double balance, String name, String email, String accountNo) {
		System.out.println("Account constructor with parameters called.");
		
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount){
		this.balance += amount;
		System.out.println("Deposit of "+amount+" made. New balance is: "+this.balance);
	}
	public void withdrawl(double amount) {
		if(balance - amount < 0)
		{
			System.out.println("Only "+balance+"available. Withdrawl not possible.");
		}
		else {
		this.balance -= amount;
		System.out.println("Withdrawl of "+amount+" processed. Remaining balance is: "+this.balance);
		}
	}
	public static void main(String args[]) {
		BankAccount bank = new BankAccount(12345, 1200.00, "Surbhi", "surbhi@gmail.com","SA12345");
		bank.deposit(700);
		bank.withdrawl(700);
	}

}
