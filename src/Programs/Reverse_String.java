package Programs;

public class Reverse_String {

	public static void main(String[] args) {
		
		
		String str = "Ramakrishna";
		
		int length = str.length();
		
		System.out.println(length);
		
		char array[] = str.toCharArray();
		
		for(int i =length-1;i>=0;i--) {
			System.out.print(array[i]);
		}
		
		
		
	
	}
}
