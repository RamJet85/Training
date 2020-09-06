package Automation_Testing;

public class Exception_Handling {

	public static void main(String[] args) {
		
	//Exception is an event, That disrupts the normal flow of the program, handling the runtime errors such as arithmetic no such element etc..
	//To handle these type of exceptions we should use try catch blocks, try block is throws the exception & catch block catch the exception
	// Try exception & catch exception should match
	// if u get any exception at the middle of the program, when u run the code automatically java will terminate the program
	//to overcome this problem we use exception handling
	//A single try block can have multiple catch blocks
	//Throwable is a super class of an exception class & error class , Exception class throwable are the child classes of throwable	
		//PrintstackTrace is used to give the exception information which line & what is the exception
		
		Exception_Handling ex = new Exception_Handling();
		ex.Division();
		try {
			Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		//Throw keyword is used to throw an exception explicitly inside the method, u cannot throw multiple exceptions
		//Throws keyword is used to declare an exception with the method signature, u can throws multiple exceptions
	}

	
	public void Division() {
	
		System.out.println("a value");
		try {
		int a =9/0;
		}
		catch (Exception e) {
			System.out.println("Exception captured");
			e.printStackTrace();// to print the exception
		}
		System.out.println("b value");
		}
	public static void Exception() {
		
		System.out.println("Exception");
		
		int b = 9/0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
