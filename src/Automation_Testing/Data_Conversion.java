package Automation_Testing;

public class Data_Conversion {

	public static void main(String[] args) {
		
		String s ="100";
		int a = 20;
		int c =10;
		System.out.println(s+a);

		//string to int
		int i =Integer.parseInt(s);		
		System.out.println(i+a);
		
		//String to double
		
		String s1 ="200";
		double d = 12.56;
		System.out.println(s1+d);
		
		//String to double
		
		double d1 =Double.parseDouble(s1);
		System.out.println(d1+d);
		
		// int to string
		
		System.out.println(a+s);
		
		String h =String.valueOf(a);
		System.out.println(h+c);
		System.out.println("**************");
		Data_Conversion data = new Data_Conversion();
		data.conversion();
			
	}

	public void conversion() {
		
		int a = 10;
	
		String s = "100";
		System.out.println(a+s);
		
		int i = Integer.parseInt(s);
		System.out.println(a+i);
		
		int b = 12;
		
		String s1 ="100";
		 
		String s2 = String.valueOf(b);
		System.out.println(s2+s1);
		
			
	}
}
