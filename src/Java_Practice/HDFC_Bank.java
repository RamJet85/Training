package Java_Practice;

public interface HDFC_Bank extends YES_Bank{
	
	// It is used to achieve abstraction, By interface, we can support the functionality of multiple inheritance.
	// Interface cannot have method body only prototype
	// Interface cannot create the object
	// In interface the variables are by default in static and final nature
	
	public void Deposite();
	
	public void Withdrawal();
	
	public void AccoutOpening();
	//static methods we cannot override and static methods are not allowed in intefaces, 
	//default methods are available in only interfaces not in classes
	//default method can be overriden by without default key
	
	public static void netBanking() { //in static methods we can give method body
		
		System.out.println("HDFC bank netBanking");
		
	}

}
