package Programs;

public class Palindrome {

	public static void main(String[] args) {
		
		
		//The number or name which remains the same when reversed
		
		String name = "RAR";
		
		StringBuilder str = new StringBuilder(name);
		
		String st = str.reverse().toString();
		
		if(name.equals(st)){
			System.out.println("Palindrome!!");
		}
		else
			System.out.println("Not a Palindrome!!");

	}

}
