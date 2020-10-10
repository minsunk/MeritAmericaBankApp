
public class CheckingAccount extends BankAccount {

	public CheckingAccount(double openingBalance, double interestRate) {
		super(openingBalance, interestRate);
	}
	
	public CheckingAccount(long accountNumber, double balance, double interestRate) {
		super(accountNumber, balance, interestRate);
	}


}

