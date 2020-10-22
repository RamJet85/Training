package Java_Practice;

public class Top_DownCasting {

	public static void main(String[] args) {
		//Type casting is when you assign a value of one primitive data type to another type.
		//Top casting, Small box can be fitted into big box, Parent class properties can use child 
		//Top Casting in data types: 
		// converting a smaller type to a larger type size here int is 4 bytes double is 8 bytes small box to big box
		// top casting --> Automatic casting
		
		int a =20;// int 4 bytes
		
		double d = a;// double 8 bytes
		System.out.println(a);
		System.out.println(d);
		
		
		double d1 = 12.34;
		
		int b = (int)d1; // by doing down casting using primitive data types but we should loss some data
		//down cast--> manual casting
		//In primitive data types down casting is possible in compile & run time but we should lost data 
		System.out.println(d1);
		
		System.out.println(b);
		
		
		

	}

}
