package Dummy_Practice;

public class Duplicatestr {

	public static void main(String[] args) {
		
		
		String str = "Ramakrishna";
		
		int length = str.length();
		
		System.out.println(length);
		
		char array[] = str.toCharArray();
		
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				
				if(array[i]==array[j]) {
					System.out.print(array[j]);
				}
			}
		}
		

	}

}
