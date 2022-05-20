package Practice;

public class Arrays {

	public static void main(String[] args) {
		
		// Object data[][] = new Object[rows][columns];
        // Object data[][] = null; 
		// data = new Object[3][2];
		
		
		Object array[] = null;   //  Object array[] = new array[size];
		
		array = new Object[4];
		
		array[0] = "Ram";
		array[1] = 28;
		array[2] = 12.34;
		array[3] = 'R';
		
		int length = array.length;
		
		System.out.println(length);
		
		for (Object obj : array) {
			
			System.out.println(obj);
			
		}
		
		
		
		
		
	}

}
