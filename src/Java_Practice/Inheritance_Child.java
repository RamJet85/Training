package Java_Practice;

public class Inheritance_Child extends Inheritance_Parent{
	
	
	public static void TCS() {
		System.out.println("TCS Inheritance_Child");
	}
	
	public void infosys() {
		System.out.println("Infosys Inheritance_Child");
	}
	
	@Override 
	// when we have a method in parent class and the same method which is available in child class with same name and same no of parameters
	// Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
	// In overriding child class method has a right to change the implementation of a method which is already provided by its superclass.
	
	public void United() {
		System.out.println("UHG InInheritance_Child");
	}
}

//Multiple inheritance is not possible in class level