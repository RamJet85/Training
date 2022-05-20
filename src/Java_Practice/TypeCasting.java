package Java_Practice;

public class TypeCasting {

	public static void main(String[] args) {

		

		//when u assign a one data type value to another data type is called type casting
		//Top casting, Small box can be fitted into big box, Parent class properties can use by child 
		//Down casting, big box cannot be fit into small box, Compile time it is allow but run time it is not allowed
		// Child class properties cannot use parent, becoz of down casting we loss the data
		//down casting is not possible with reference variables, It possible in primitive data types
		//In interfaces down casting is not allowed at the compile time also
		
		//top casting
		int myint = 9; // size 4
		double db = myint; // size 8
		System.out.println(myint);
		System.out.println(db);
		
		//down casting
		double d = 9.23; // 8
		int a = (int) d; // 4
		System.out.println(a);
		
		//int it = (int) down;
		
		
	}

}
