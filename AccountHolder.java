
public class AccountHolder {
	private String myFirstName;
	private String myMiddleName;
	private String myLastName;
	private String mySsn;
	private CheckingAccount myCheckingAccount;
	private SavingsAccount mySavingsAccount;
	
	public static void AccountHolder() {
		myFisrtName = "";
		myMiddleName = "";
		myLastName =  "";
		mySsn = "";
		myCheckingAccount = new CheckingAccount(0);
		mySavingsAccount = new SavingsAccount(0);
	}
	public static void AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingAccountOpeningBalance) {
		myFirstName = firstName;
		myMiddleName = middleName;
		myLastName = lastName;
		mySsn = ssn;
		myCheckingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		mySavingsAccount = new SavingsAccount(savingAccountOpeningBalance);
	}
	public String getFirstName() {
		return myFirstName;
	}
	public String setFirstName(String firstName) {
		myFirstName = firstName;
	} 
	public String getMiddleName(String middleName) {
		return myMiddleName;
	}
	public String setMiddleName(String middleName) {
		myMiddleName = middleName;
	}
	public String getLastName() {
		return myLastName;
	}
	public String setLastName(String lastName) {
		myLastName = lastName;
	}
	public String getSSN() {
		return ssn;
	}
	public String setSSN()
		mySsn = ssn;
	}
	public CheckingAccount getCheckingAccount() {
		return myCheckingAccount;
	}
	public CheckingAccount getSavingsAccount() {
		return mySavingsAccount;
	}
}
