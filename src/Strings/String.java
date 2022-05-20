package Strings;

public class String {

	public static void main(java.lang.String[] args) {

		java.lang.String str = "Ramakrishna";
		
		int length = str.length();
		System.out.println("Length of the string is: "+length);
		
		System.out.println(str.charAt(5));

		System.out.println(str.indexOf('a'));
		
		System.out.println(str.substring(4,10));
		System.out.println(str.substring(6));
		
		java.lang.String st = "Ram-Hai-Krishna-Baleno";
		
		java.lang.String[] array = st.split("-");
		
		for (java.lang.String st1 : array) {
			
			System.out.println(st1);
			
		}
	}

}
