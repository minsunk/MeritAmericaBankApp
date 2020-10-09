public class MeritAmericaBankApp {

	public static void main(String args[]) {
		// 1. Instantiate an account holder with a checkings balance of $100 and a savings balance of $1000
		AccountHolder firstAccount = new AccountHolder("Minsun", "", "Kim", "111111111", 100.0, 1000.0);
		
		// 2. Display the account holder's toString() output
		System.out.println(firstAccount.toString());

		// 3. Deposit $500 into the checking account
		firstAccount.getCheckingAccount().deposit(500);

		// 4. Withdraw $800 from the savings account
		firstAccount.getSavingsAccount().withdraw(800);
		
		// 5. Display the checking account toString() output
		firstAccount.getCheckingAccount().toString();
		
		System.out.println(firstAccount.getCheckingAccount().toString());
		
		// 6. Display the savings account toString() output
		System.out.println(firstAccount.getSavingsAccount().toString());
		
		// 7. Instantiate another account holder with a checking balance of $200 and a savings balance of $500
		//AccountHolder secondAccount = new AccountHolder("Jihan", "", "Joo", "222222222", 200.0, 500.0);
		AccountHolder secondAccount = new AccountHolder();
		secondAccount.setFirstName("Jihan");
		secondAccount.setMiddleName("");
		secondAccount.setLastName("Joo");
		secondAccount.setSSN("222222222");
		secondAccount.getCheckingAccount().deposit(200.0);
		secondAccount.getSavingsAccount().deposit(500.0);
		
		// 8. Deposit -$500 into the checking account
		secondAccount.getCheckingAccount().deposit(-500.0);
		
		// 9. Withdraw $600 from the savings account
		secondAccount.getSavingsAccount().withdraw(600.0);
		
		// 10. Dispaly the second account holder's toString() output
		System.out.println(secondAccount.toString());
	
	}
}
//1. Add 5 CDOfferings to MeritBank
//2. Instantiate a new AccountHolder (ah1)
//3. Add a checking account with an opening balance of $1,000 as well as a savings account 
//   with an opening balance of $10,000 to ah1
//4. Add a checking account with an opening balance of $5,000 as well as a savings account
//   with an opening balance of $50,000 to ah1
//5. Add a checking account with an opening balance of $50,000 as well as a savings account
//   with an opening balance of $500,000 to ah1
//6. Add a checking account with an opening balance of $5,000 as well as a savings account 
//   with an opening balance of $50,000 to ah1
//7. Confirm last checking and savings accounts were not created
//8. Add the best CD Offering as a CD account on ah1
//9. Add ah1 to Merit Bank's list of account holders
//10. Instantiate a new AccountHolder (ah2)
//11. Add a checking account with an opening balance of $1,000 as well as a savings account
//    with an opening balance of $10,000 to ah2
//12. Add the second best CD offering as a CD account on ah2
//13. Add ah2 to Merit Bank's list of account holders
//14. Clear the CDs being offered by MeritBank
//15. Instantiate a new AccountHolder (ah3)
//16. Add the second best CD offering as a CD account on ah3
//17. Confirm a CD account was not created on ah3
//18. Add a checking account with an opening blance of $1,000 as well as a savings account 
//    with an opening balance of $10,000 to ah3
//19. Add ah3 to Merit Bank's list of account holders
//20. Get the total balance of all accounts held by Merit Bank's account holders
  

