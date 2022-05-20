package Java_Practice;

public class String_Rev {

	public static void main(String[] args) {

		
		String str = "Ramakrishna";
		int len = str.length();
		System.out.println("The length of the string is: "+len); //11
		
		char[] ch = str.toCharArray();
				
		for(int i=len-1;i>=0;i--){
			
			System.out.print(ch[i]);
			
		}
		
	}

}
