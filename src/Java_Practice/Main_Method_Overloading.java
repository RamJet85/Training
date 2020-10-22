package Java_Practice;

public class Main_Method_Overloading {

	public static void main(String[] args) {
		
		//We can overloading main method also static methods
		// We cannot override static methods
		
		Main_Method_Overloading.main(10);
		 main("Ram");
		
	}
	
    public static void main(int i) {
    	
    	System.out.println("Main method with integer "+ i);
		
	}
    public static void main(String name) {
	
    	System.out.println("Main method with String " +name);
	}
	

}
