
public class SavingsAccount extends BankAccount {
	protected final double ANNUAL_INTEREST_RATE =  .01;

	public SavingsAccount(double openingBalance) {
		super(openingBalance);
	}

	public String toString(){
		return "Savings Account Balance: $" + currentBalance + "\n" +
			"Savings Account Interest Rate: " + ANNUAL_INTEREST_RATE*100 + "\n" +
			"Savings Account Balance in 3 years: $" + String.format("%.2f", futureValue(3))+ "\n";		
	}
}


