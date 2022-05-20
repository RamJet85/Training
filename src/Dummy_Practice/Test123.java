package Dummy_Practice;

public class Test123 {

	public static void main(String[] args) {
		
		
		String str ="ramakrishna";
		
		Integer length = str.length();
		
		System.out.println(length);
		
		char[] array = str.toCharArray();
		
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(array[i]==array[j]){
					System.out.println(array[j]);
					break;
				}
			}
		}

	}

}
