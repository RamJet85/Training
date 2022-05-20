
public class String_occurrence {

	public static void main(String[] args) {
		
		
		String str = "Selenium";
		
		System.out.println(str.charAt(4));
		
		int length = str.length();
		
		char search = 'e';        
		
		  
		  int count=0;
		  
		  for(int i=0; i<length; i++)
		  {
		      if(str.charAt(i) == search) {
		      count++;
		      }
		  }
		  
		  
		  System.out.println(count);
		  
		

	}

}
