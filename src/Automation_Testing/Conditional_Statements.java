package Automation_Testing;

public class Conditional_Statements {

	public static void main(String[] args) {
		
		  //conditional statements are used for which statement will be executed next
		  //To compare the variables
		  // Conditional statements are used to decide the flow of execution based on different conditions. 
		//If a condition is true, you can perform one action and if the condition is false, you can perform another action.

		int a = 100;
		int b = 200;
		if(a>b) {
			System.out.println("a is the bigger than b");
		}
		if(a<b) {
			System.out.println("a is the smaller than b");
		}
		System.out.println("**********");
		
		String browsername = "Chrome";
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.out.println("Launch the chrome browser");
		}
		else if(browsername.equals("ff")) {
			System.out.println("Launch the ff browser ");
		}
		
		else if(browsername.equals("IE")) {
			System.out.println("Launch the IE browser ");
		}
		else {
			System.out.println("The browser not found");
		}
		System.out.println("**********");
		
		if(a==b) {
			System.out.println("the values are same");
		}
		else if (a!=b) {
			System.out.println("the values are not correct");
			
		}
		
		// find the highest no out of 3 values
		int x = 200;
		int y = 400;
		int z = 500;
		
		if(x>y && x>z) {
			System.out.println("X is the highest no");		
		}
		else if(y>z) {
			System.out.println("Y is the highest");
		}
		else {
			System.out.println("z is the highest");
		}
		
		
	}

}
