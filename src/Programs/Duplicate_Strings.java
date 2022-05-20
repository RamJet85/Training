package Programs;

public class Duplicate_Strings {

	public static void main(String[] args) {
		
		String str = "Ramakrishna";
		
		int length = str.length();
		System.out.println("The length of the string is: "+length);
		
		
	      char[] carray = str.toCharArray();
	      
	           
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < length; i++) {
	         for (int j = i + 1; j < length; j++) { // We should compare with others so we use R == a, 
	        	
	        	 //we shoudn't r==r so thats why we put i+1
	        	 
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;
	               
	            }
	         }
	        
	      }
	      

	     
	}

}
