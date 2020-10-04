public class CheckingAccount {
	
	protected double currentBalance;
	final double ANNUAL_INTEREST_RATE =  .0001;

	public CheckingAccount(double openingBalance) {
		currentBalance = openingBalance;
	}
	
	public double getBalance() {
		return currentBalance;
	}
	
	public double getInterest() {
		return ANNUAL_INTEREST_RATE; 
	}
	
	public boolean withdraw(double amount) {
		if (amount >= 0 && amount <= currentBalance) {
			currentBalance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean deposit(double amount) {
		if (amount >= 0){
			currentBalance +=amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double futureValue(int years) {
		return currentBalance * Math.pow(1 + ANNUAL_INTEREST_RATE, years);
	}
	
	public String toString(){
		return "Checking Account Balance: $" + currentBalance + "\n" +
			"Checking Account Interest Rate: " + ANNUAL_INTEREST_RATE*100 + "\n" +
			"Checking Account Balance in 3 years: $" + futureValue(3) + "\n";		
	}
	
	
	

}
