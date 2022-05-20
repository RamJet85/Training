package Programs;

public class SplitTest {

	public static void main(String[] args) {
		//Splits a string into array of substrings
		
		String name = "My;Home;Hub;Hitech;city";
		
		System.out.println(name.length());
		
		String[] split = name.split(";");
		
		System.out.println(split.length);
		
		//for each
		for (String s : split) { // datatype refvar arrayname
			
			System.out.println(s);
			
		}
		//for loop
		
		/*for(int i =0;i<split.length;i++){
			System.out.println(split[i]);
			
		}*/

	}

}

