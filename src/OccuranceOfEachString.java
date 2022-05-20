import java.util.HashMap;

public class OccuranceOfEachString {

	public static void main(String[] args) {
		
		String str = "ttyyuuiiooppyr";
		
		int length = str.length();
		
		System.out.println(length); //22
		
		//Creating a HashMap containing char as a key and occurrences as a value
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(int i=0;i<length;i++){
			
			if(hmap.containsKey(str.charAt(i))){
				
				int count = hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
			
			}
			else{
				
				hmap.put(str.charAt(i), 1);
					
			}
			
			
		}
		
		System.out.println(hmap);
	}

}
