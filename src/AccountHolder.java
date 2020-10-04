
public class AccountHolder {
	private String myFirstName;
	private String myMiddleName;
	private String myLastName;
	private String mySsn;
	private CheckingAccount myCheckingAccount;
	private SavingsAccount mySavingsAccount;
	
	public AccountHolder() {
		myFirstName = "";
		myMiddleName = "";
		myLastName =  "";
		mySsn = "";
		myCheckingAccount = new CheckingAccount(0.0);
		mySavingsAccount = new SavingsAccount(0.0);
	}
	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingAccountOpeningBalance) {
		myFirstName = firstName;
		myMiddleName = middleName;
		myLastName = lastName;
		mySsn = ssn;
		myCheckingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		mySavingsAccount = new SavingsAccount(savingAccountOpeningBalance);
	}
	
	public String getFirstName(String firstName) {
		return myFirstName;
	}
	
	public void setFirstName(String firstName) {
		myFirstName = firstName;
	}
	
	public String getMiddleName(String middleName) {
		return myMiddleName;
	}
	
	public void setMiddleName(String middleName) {
		myMiddleName = middleName;
	}
	public String getLastName(String lastName) {
		return myLastName;
	}
	
	public void setLastName(String lastName) {
		myLastName = lastName;
	}
	
	public String getSSN(String ssn) {
		return mySsn;
	}
	
	public void setSSN(String ssn) {
		mySsn = ssn;
	}

	public CheckingAccount getCheckingAccount() {
		return myCheckingAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		return mySavingsAccount;
	}
	
	public String toString(){
		return "Name: " + myFirstName + " " + myMiddleName + " " + myLastName + "\n" +
			"SSN: " + mySsn + "\n" + 
			myCheckingAccount.toString() +
			mySavingsAccount.toString();
					
	}
}
