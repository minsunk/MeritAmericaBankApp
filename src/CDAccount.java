//import java.util.*;

public class CDAccount extends BankAccount {
	private CDOffering cdCDOffering;
	private double cdBalance;
	
	//1. CDAccount(CDOffering offering, double balance)
	public CDAccount(CDOffering offering, double balance){
		super(balance, offering.getInterestRate());
		cdCDOffering = offering;
		cdBalance = balance;
	}
	//2. double getBalance()
	public double getBalance(){
		return cdBalance;
	}
	
	//3. double getInterestRate()
	public int getTerm(){
		return cdCDOffering.getTerm();
	}
	
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
