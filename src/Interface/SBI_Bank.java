package Interface;

public class SBI_Bank implements HDFC_Bank, HSBC_Bank, ICICI_Bank {

	@Override
	public void personalLoan() {
		
		System.out.println("SBI bank personalLoan");
		
	}

	@Override
	public void addBefificiary() {
		System.out.println("SBI bank addBefificiary");
		
	}

	@Override
	public void deleteBenificiary() {
		System.out.println("SBI bank deleteBenificiary");
		
	}

	@Override
	public void Deposite() {
		System.out.println("SBI bank Deposite");
		
	}

	@Override
	public void Withdrawal() {
		System.out.println("SBI bank Withdrawal");
		
	}

	@Override
	public void AccoutOpening() {
		System.out.println("SBI bank AccoutOpening");
		
	}
	// Non overridden methods
	public static void houseLoan() {
		System.out.println("SBI bank houseLoan");
	}
	
	public void edLoan() {
		System.out.println("SBI bank edLoan");
	}

	@Override
	public void resetPassword() {
		System.out.println("SBI bank resetPassword");
		
	}

}
