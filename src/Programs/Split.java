package Programs;

public class Split {

	public static void main(String[] args) {

		String name ="Hello this is my java code";
		int length = name.length();
		System.out.println("The length of the string is: "+length);
		
		String splitlen[] = name.split(" ");
		
		int length2 = splitlen.length;

		
		System.out.println(length2);
					
			for(int i=0;i<length2;i++) {
			System.out.println(splitlen[i]);
			
		}
	}

}
