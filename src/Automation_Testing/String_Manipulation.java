package Automation_Testing;

public class String_Manipulation {

	public static void main(String[] args) {
		
		//String Manipulation manipulating the string into different types
		
		String name = "Hello this my String class in java";
		
		int len = name.length();
		System.out.println("The length of the string is: "+len);
		char ch = name.charAt(6);
		System.out.println("The value is: "+name.charAt(len-2));
		System.out.println("The char value is: "+ch);
		
		System.out.println(name.indexOf('t'));// 1st occurrence of t
		System.out.println(name.indexOf('t', 8));// 2nd occurrence of t
		
		//Substring it is a part of a string
		
		System.out.println("***** Sub String *****");
		System.out.println(name.indexOf("String"));
		System.out.println(name.indexOf("Ram"));
		
		String s8 = "Your transaction id is 12345";
		System.out.println(s8.substring(5, 10));
		System.out.println(s8.substring(5));
		//System.out.println(s8.substring(s8.indexOf(5)));
		
		//Split
		System.out.println("***** Split *****");
		String lang = "Ram-Charan-Dhruva-Rstm";
		System.out.println(lang.split("-")[3]);
		
		
		//System.out.println(name.charAt(37));
		
		String s1 = "Facebook";
		String s2 = "facebook";
		
		String s3 = s1+s2;
		System.out.println(s3);
		int lenofs3 = s3.length();
		System.out.println("The length of s3 is: "+lenofs3);
		
		if(s1.equals(s2)) {
			System.out.println("The values are same");
		}
		else {
			System.out.println("The values are not same");

			}
		 
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("The values are same");
		}
		else {
			System.out.println("The values are not same");

			}
		//Upper & lower case
		String s4 = "This is my Life";
		System.out.println(s4.toUpperCase());	
		System.out.println(s4.toLowerCase());
		
		//Trim is used to remove only the before & after spaces for a string
		
		String s5 = "     Hello World   ";
		System.out.println(s5.trim());
		
		//replace
		
		String s6 = "Ram Charan";
		System.out.println(s6.replace(" ", ""));
		
		//Contains
		String Username = "Fraudshare Application";
		System.out.println(Username.contains("Application"));
		
		if(Username.contains("Application")) {
			System.out.println("Username matched");
		}
		else {
			System.out.println("Username not matched");
		}
		
		//Sub String
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
