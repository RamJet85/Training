package Dummy_Practice;

public class Arrays {

	public static void main(String[] args) {

		
		Object array[] = new Object[5];
		array[0] = 10;
		array[1] = "Ram";
		array[2] = 12.34;
		array[3] = 'R';
		array[4] = 353463;
		
		System.out.println("The length of an array: "+array.length);
		
		
		
		for (Object arr : array) {
			System.out.println("Tha values are: "+arr);
			
		}
		
		System.out.println("Using for loop");
		for(int i=0;i<array.length;i++){
			System.out.println("The values of for loop is: "+array[i]);
		}
	}

}
