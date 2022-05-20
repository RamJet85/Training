
public class Encapsulation1 {
	
	public String bankName;
	private String branchName;
	private int balance;
	
	
	public String getBranchName(){
		return branchName;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance){
		
		this.balance = balance;
	}
	
	public void setBranchName(String branchName){
		
		this.branchName = branchName;
	}
	


	public static void main(String[] args) {
		
		
		Encapsulation1 en = new Encapsulation1();
		en.setBalance(2000);
		en.setBranchName("HDFC");
		
		System.out.println(en.getBalance()+" "+en.getBranchName());
		
		

	}

}
