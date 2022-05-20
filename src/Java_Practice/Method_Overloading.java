package Java_Practice;

public class Method_Overloading {

	public static void main(String[] args) {
		
	//within the class when we have multiple methods with same name, with diff no of parameters and with diff sequence(order) of params
	//compiler will decide which method has to execute on the basis of what are the parameters that you are passed
	//Method overloading is always in within a class
	//Overriding in parent & child classes
	//Method overloading is used to increase the readability of the code.
    //We can overload the main method also
	//It gives flexibility to call a similar method with different types of data
		
		Method_Overloading obj = new Method_Overloading();
		obj.loginMethod();
		obj.loginMethod(890);
		obj.loginMethod(12.67);
		obj.loginMethod("Ram", "charan");
		
	//@Override 
	// when we have a method in parent class and the same method which is available in child class with same name and same no of parameters
	// Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
	// In overriding child class @overriden method has a right to change the implementation of a method which is already provided by its superclass.
		
		
	}
	
	public void loginMethod() {
		System.out.println("Login simple method");
	}
	public void loginMethod(int OTPno) {
		System.out.println("Login with OTP "+OTPno);
	}
	public void loginMethod(String username,String password) {
		System.out.println("Login with username & password " +username+" "+" "+password);
	}
	public void loginMethod(double d) {
		System.out.println("By using double "+d);
		
		
	}
	
}
