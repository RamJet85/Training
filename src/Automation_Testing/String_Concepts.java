package Automation_Testing;

public class String_Concepts {

	public static void main(String[] args) {
		
		//String is used to store the collection of multiple characters, it could be special chars no's chars values which is surrounded by double quotes
		//String will maintain one array internally
		//Collection of multiple chars 
		String s ="Ram";
		String s1 ="krishna";
		String s2 = s+s1;
		System.out.println(s2);
		
		int len = s2.length();
		System.out.println("The length of the string is: " +len);
		
		
		int a =100;
		int b= 200;
		
		System.out.println("The value is "+ s+a+b);
		System.out.println(a+b);
		System.out.println("The concat value is "+s+s1+a+b);
		System.out.println("The concat value is "+s+s1+(a+b));
		
		String s3 = s.concat(s1);
		System.out.println(s3);
		
		String browser = "chrome";
		double version = 12.33;
		
		System.out.println("The browser name is: "+browser + " and version is: "+ version);
		
		System.out.println("First name is: "+ s +" Last name is: "+s1);
		
		

	}

}
