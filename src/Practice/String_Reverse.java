package Practice;

public class String_Reverse {

	public static void main(String[] args) {
		
		String str = "Ramakrishna";
		
		int length = str.length();
		
		System.out.println("length of the string is: "+length);
		
		char[] array = str.toCharArray();
		
		for(int i = length-1;i>=0;i--) {
			
			System.out.println(array[i]);
		}
		
		
	}

}
