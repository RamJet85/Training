package Automation_Testing;

public class Test_Bank {

	public static void main(String[] args) {
		
		SBI_Bank bank = new SBI_Bank();
		
		System.out.println(ICICI_Bank.name);
		System.out.println(ICICI_Bank.balance);
		
		System.out.println();
		
		bank.Deposite();
		bank.Withdrawal();
		bank.AccoutOpening();
		
		bank.addBefificiary();
		bank.deleteBenificiary();
		
		bank.personalLoan();
		
		SBI_Bank.houseLoan();
		
		bank.edLoan();	
		
		HDFC_Bank.netBanking(); // non overriden method/static method 
		bank.resetPassword();
		
		HDFC_Bank b1 = new SBI_Bank();// Child class object parent interface reference
		
		b1.AccoutOpening();
		b1.Deposite();
		b1.Withdrawal();
		b1.resetPassword();
		
		
		
		
		
		
		
		
		
		
	}

}
