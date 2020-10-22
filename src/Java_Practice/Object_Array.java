package Java_Practice;

public class Object_Array {

	public static void main(String[] args) {

		
		// i want to store the car details, size is fixed here
		//Object array is a class, using this we can store different data type of values
		
		Object obj[] = new Object[6];
		obj[0] ="Hyundai i20";
		obj[1] = 2020;
		obj[2] = 850000.23;
		obj[3] = 'H';
		obj[4] = 18.5;
		obj[5] = true;
		int len = obj.length;
		System.out.println("The length of the object array is: "+len);
		
		for(int i=0;i<len;i++) {
			System.out.println("The total car details is: "+obj[i]);
		}
		
	}

}
