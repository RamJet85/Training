package Java_Practice;

public class Arrays_static {

	public static void main(String[] args) {
		
		//Arrays are used store the fixed size collection of elements of the same data type values
		
		//datatype arrayname[] = new datatype[size]
		// In static array size is fixed, To overcome this size issue we should go with collections array list
		
		
		int values[]= new int[5];
		values[0]=10;
		values[1]=20;
		values[2]=30;
		values[3]=40;
		values[4]=50;
		//values[5]=60;
		
		System.out.println(values[4]);
		
		int length = values.length;
		System.out.println("The length of the array is: "+length);
		// To print all the array values using for loop
		
		System.out.println("*** For loop ***");
		for(int i=0;i<length;i++) {
			System.out.println("The values of an array is: "+values[i]);
		}
		//While loop
		System.out.println("*** While loop ***");
		
		int j=0;
		while(j<5) {
			System.out.println("The value of an array is: "+values[j]);
			j++;
			
		}
		//do while loop
		System.out.println("*** Do-While loop ***");
		
		int k=0;
		do {
			System.out.println("The values of an array is: "+values[k]);
			k++;
		}
		while(k<length);
		
		
	}

}
