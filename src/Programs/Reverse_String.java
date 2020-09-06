package Programs;

public class Reverse_String {

	public static void main(String[] args) {
		
		String testString ="Cricket";
		String reverseString ="";
		int length = testString.length();
		System.out.println("The length of the string is:"+length);
		
		for(int i=0;i<length;i++) {
			reverseString+=testString.charAt(testString.length()-i-1); 
		}
        System.out.println("The actual string is: " +testString);
        System.out.println("The reverse string is: " +reverseString);
	
	}
}
