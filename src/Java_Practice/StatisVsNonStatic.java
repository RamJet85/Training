package Java_Practice;

public class StatisVsNonStatic {
	// global variables 
	//how to access class vars by using object name
	
	String name;
	static int age;
	public static void main(String[] args) {
		
		// method with static keyword is called static method, variables are denoted with static is called static variable
		// how to access non static methods & vars by creating the object
		// object will hold only non static properties vars & methods
		//Static methods & vars are stored in CMA, where properties values are same for all the objects always better to use static
		//if u have a common property then make it as static ex static int wheels =4, we can use anywhere using class name or directly
		//Whenever the object(RHS) got created non static stuff will stored in heap memory
		//Static stuff will always be stored into CMA, Object will never hold static stuff 
		//Static stuff can be called by obj but warning u should get, Static stuff id the common properties for all the objects
		StatisVsNonStatic obj = new StatisVsNonStatic();
		obj.name ="Ram";
		System.out.println("Non static method: "+obj.name );
		obj.getName();
		
		// static means common properties for all the objects
		// how to access static methods & vars,  Directly we can call or by using class name 
		//Object cannot holds static methods & variables and the static methods & vars will get stored in method area or 
		//common memory allocation
		// Non static stuff will get stored in heap memory & static stuff get stored into stack memory
		// so because of the reason main method is static in nature compiler will directly call the main method
		// If both methods are static then two methods are able to call each other
		
		age =20;
		System.out.println(age);
		getValue();
		
		//objects will store inside the heap memory and non static vars & methods will get stored into objects u should call using object name
		//Obj reference var is stored in stack memory, Object ref is pointing to stack to heap
		//Static stuff will get stored in inside the CMA common memory allocation, the stuff can be accessed by without creating the object,
		//Object will not hold the static stuff
	}
	
	public static void getValue() {
		System.out.println("Get value is... ");
	}
	
	public void getName() {
		System.out.println("Get name is...");
	}

}
