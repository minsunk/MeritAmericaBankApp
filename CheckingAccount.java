
public class CheckingAccount {
	
	private final double ANNUAL_INTEREST_RATE =  .01;
	private double currentBalance;
	
	public void CheckingAccount(double openingBalance) {
		currentBalance = openingBalance
	}
	public double getBalance() {
		return currentBalance;
	}
	public double getInterest() {
		return 
	}
	public boolean withdraw(double amount) {
		if (amount =< currentBalance) {
			currentBalance -= amount;
			return true;
		}
		else
			return false;
			
	}
	
	
	

}
