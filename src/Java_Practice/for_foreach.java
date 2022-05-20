package Java_Practice;

public class for_foreach {

	public static void main(String[] args) {
		
		Object array[] = new Object[5];
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		
		System.out.println(array.length);
		
		for (Object i : array) {
			
			System.out.println("The values are "+i);
			
		}
		
		for(int i=0;i<array.length;i++){
			
			System.out.println(array[i]);
		}

	}

}
