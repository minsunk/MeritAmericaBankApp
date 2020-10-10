//import java.util.*;

public class CDAccount extends BankAccount {
	private CDOffering cdCDOffering;
	
	//1. CDAccount(CDOffering offering, double balance)
	public CDAccount(CDOffering offering, double balance){
		super(balance, offering.getInterestRate());
		cdCDOffering = offering;
	}
	//2. double getBalance()
	
	//3. double getInterestRate()
	
	//4. java.util.Date getStartDate()
	/*
	public Date getStartDate(){
		return 
	}
	*/
	
	//5. long getAccountNumber()
	/*	
  	public long getAccountNumber(){
		return super.getAccountNumber();
	}
	*/

	//6. double futureValue()
	/*public long futureValue(){
		return super.futureValue;
	}
	*/
}
