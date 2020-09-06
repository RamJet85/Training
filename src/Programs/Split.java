package Programs;

public class Split {

	public static void main(String[] args) {

		String name ="Hello this is my java code";
		int length = name.length();
		System.out.println("The length of the string is: "+length);
		
		String splitlen[] = name.split(" ");
		System.out.println(splitlen.length);
					
			for(int i=0;i<6;i++) {
			System.out.println("The spliting is: "+splitlen[i]);
			
		}
	}

}
