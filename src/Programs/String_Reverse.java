package Programs;

public class String_Reverse {

	public static void main(String[] args) {
		
		String st ="Ramkrishna";
		
		StringBuilder sb = new StringBuilder(st);
		StringBuffer sd = new StringBuffer(sb);
		System.out.println(sb.reverse());
		System.out.println(sd.reverse());
		
	
// What is the difference between equals() method and == operator?
// The equals() method matches content of the strings whereas == operator matches object or reference of the strings.
// We can use == operator for reference comparison (address comparison).
		
		String lifeOfRam = "LifeOfRam";
		String lifeOf ="LifeOf";
		boolean content = lifeOfRam.equals(lifeOf);
		//lifeOfRam.equalsIgnoreCase(st); it ignores the case considerations
		System.out.println("Equals method "+content);
		
		String eq1 = "RFA";
		String eq2 = "RFA";
		
		int a =10;
		int b =40;
		
			System.out.println(eq1==eq2);
			
			System.out.println(a==b);
		
			/*
			 * String s1 = new String("TUTORIALSPOINT"); String s2 = new
			 * String("TUTORIALSPOINT"); //Reference comparison System.out.println(s1 ==
			 * s2);
			 */
			
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
