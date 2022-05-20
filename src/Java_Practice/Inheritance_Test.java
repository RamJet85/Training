package Java_Practice;

public class Inheritance_Test {

	public static void main(String[] args) {
		
		//Using properties from super class to sub class is called inheritance
		// Car is a sub class and vehicle is a super class car is able to get the all prop from vehicle class
		
		Inheritance_Child child = new Inheritance_Child();// child class ref and child class object
		int a =20;
		double d = a;
		System.out.println(a); //int --> double
		System.out.println(d);
		
		child.Trianz();
		child.Accenture();
		child.Realpage();
		child.infosys();
		
		
		Inheritance_Child.TCS();
		child.United();
		
		System.out.println("*********");
		
		//when u assign a one data type value to another data type is called type casting
		//Top casting, Small box can be fitted into big box, Parent class properties can use by child 
		
		int myint = 9;
		double db = myint;
		System.out.println(myint);
		System.out.println(db);
		
		Inheritance_Parent parent = new Inheritance_Child();
		
		// parent class refe and child class object
		//If a child class object can be referred by parent class reference variable 
		
		parent.Accenture();//Inherited methods
		parent.Trianz(); //Inherited methods
		parent.Realpage(); //Inherited methods
		parent.United(); // Overridden method, Object is child so child class overridden method will be executed
		
		
	
		System.out.println("********");
		Inheritance_Parent p1 = new Inheritance_Parent(); // parent class object & parent class object
		p1.Accenture();
		p1.Realpage();
		p1.Trianz();
		p1.United();// Object is parent so parent class method will be executed
		
		
		//Down casting, big box cannot be fit into small box, Compile time it is allow but run time it is not allowed
		// Child class properties cannot use parent, becoz of down casting we loss the data
		//down casting is not possible with reference variables, It possible in primitive data types
		//In interfaces down casting is not allowed at the compile time also
		//Inheritance_Child c1 = (Inheritance_Child) new Inheritance_Parent(); //Compile time
		// Parent class object and child class reference variable
		//c1.Accenture(); // Run time exception, not allowed classcastexception in java
		//Down Casting example
		
		double down = 8.9;
		int it = (int) down;// during down casting u should loose the data
		
		System.out.println(down);
		System.out.println(it);
	}

}
