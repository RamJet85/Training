package Java_Practice;

public class Practice {

	public static void main(String[] args) {
		
		//Split
		
		String lang = "Ram;krishna;anu;sha";
		String[] split = lang.split(";");
		for (String s : split) {
			System.out.println(s);
		}

		
		String name = "Ramkrishna";
		String s1 = "Anusha";
		System.out.println(name.charAt(4));
		
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.substring(3,5));
		
		
		System.out.println(name.concat(s1));
		
		System.out.println(name.replace("Ramkrishna", "ert"));
		
		
		
	}

}
