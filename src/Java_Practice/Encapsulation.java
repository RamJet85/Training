package Java_Practice;

public class Encapsulation {
	
	public String bankName;
	public String branch;
	private int balance; 
	
	//Within the class we can access the private variables, outside of the class we can't access 
	//variable is declared any variable name as private, we cannot access it from outside the class
	// Hiding the internal implementation of the class is called encapsulation, using getter and setter methods we can get and set the data
	//Suppose if variable is private we can use this var inside the class only, If u want use this outside u should create a layer or a
	//method in the form of setter and getter
	//getter and setter methods are used to access the class variables, we can create for private & public vars & methods
	
	
	public int getBalance() {
		return balance;
	}
    
	//Private method
	private void empSalary() { // to use this private method u have to create the layer with public
		System.out.println("Employee salary");
	}
	// If both methods are no static then two methods are able to call each other without creating the object
	public void getempDada() {
		empSalary();
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Encapsulation(String bankName, String branch, int balance) {
		this.bankName = bankName;
		this.branch = branch;
		this.balance = balance;
	}


	public static void main(String[] args) {
		
		Encapsulation e1 = new Encapsulation("HDFC", "Hi-tech city", 1000);
		System.out.println(e1.bankName);
		System.out.println(e1.branch);
		System.out.println(e1.balance);
		
     
	}

}
