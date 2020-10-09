
public class MeritBank {
	private static AccountHolder[] accountHolderList = null;
	private static CDOffering[] cdOfferingList = null;
	//1. static void addAccountHolder(AccountHolder accountHolder)
	public static void addAccountHolder(AccountHolder accountHolder) {
		if (accountHolderList == null) {
			accountHolderList = new AccountHolder[1];
			accountHolderList[0] = accountHolder;
		} else {
			AccountHolder[] tempAccountHolderList = new AccountHolder[accountHolderList.length + 1];
			for (int i = 0; i < accountHolderList.length; i++) {
				tempAccountHolderList[i] = accountHolderList[i];
			}
			tempAccountHolderList[accountHolderList.length] = accountHolder;
			accountHolderList = tempAccountHolderList;
		}
	}

	//2.static AccountHolder[] getAccountHolders()
	public static AccountHolder[] getAccountHolders() {
		return accountHolderList;
	}
	//3.static CDOffering[] getCDOffering(){
	public static CDOffering[] getCDOffering() {
		return cdOfferingList;
	}
	//static CDOffering getBestCDOffering(double depositAmount)
	public static CDOffering getBestCDOffering() {
		int bestOfferingIndex = 0;
		
		for (int i = 1; i < cdOfferingList.length; i++){
			if (Math.pow(1 + cdOfferingList[i].getInterestRate(), cdOfferingList[i].getTerm()) > 
			Math.pow(1 + cdOfferingList[bestOfferingIndex].getInterestRate(), cdOfferingList[bestOfferingIndex].getTerm())) {
				bestOfferingIndex = i;
			}                     
		}
		
		return cdOfferingList[bestOfferingIndex];
	}
	//static CDOffering getSecondBestCDOffering(double depositAmount)
	public static CDOffering getSecondBestCDOffering() {
		int bestOfferingIndex = 0;
		int secondBestOfferingIndex = 0;
		
		for (int i = 1; i < cdOfferingList.length; i++){
			if (Math.pow(1 + cdOfferingList[i].getInterestRate(), cdOfferingList[i].getTerm()) > 
			Math.pow(1 + cdOfferingList[bestOfferingIndex].getInterestRate(), cdOfferingList[bestOfferingIndex].getTerm())) {
				secondBestOfferingIndex = bestOfferingIndex;
				bestOfferingIndex = i;
			}                     
		}
		
		return cdOfferingList[secondBestOfferingIndex];
	
	}
	//static void clearCDOfferings()
	//static void setCDOfferings(CDOffering[] offerings)
	public static void setCDOfferings(CDOffering[] offerings) {
		cdOfferingList = offerings;
	}
	//static long getNextAccountNumber()
	//static double totalBalances()
	//static double futureValue(double presentvalue, double interestRate, int term)hematoma
	
}
