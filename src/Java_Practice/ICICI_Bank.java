package Java_Practice;

public interface ICICI_Bank {
	
	// In interface the variables are by default in static and final
	
	//to provide constant values, if u declared final keyword the value cannot be changed eg final int i 20; i value can't be changed
	//To prevent overriding, if u declare a method with final no one can override
	//To prevent inheritance, if u declare final any class that class cannot be a parent for any class
	
	int balance = 20000;
	
	static String name = "Ram";
	
	public void personalLoan();

}
