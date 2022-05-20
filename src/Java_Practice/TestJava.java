package Java_Practice;

public class TestJava {

	public static void main(String[] args) {
		
         String str = "Agjttijccf";
		
		System.out.println("The length is: "+str.length());
		
		char[] array = str.toCharArray();
		
		System.out.print("The dupliacte values are: ");
		
		for(int i=0;i<str.length();i++){
			
			for(int j =i+1;j<str.length();j++){
				
				
				if(array[i]==array[j]){
					
					System.out.println(array[j]);
					
				}
				
				
			}
			
		}
		

	}
		
		



}
