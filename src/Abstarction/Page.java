package Abstarction;

public abstract class Page { // a class which is defined with abstract keyword it is called abstract class
	
	// a method which is having no method body is called abstraction methods
	// We cannot create the object of abstract class & interface
	// We can create the constructor for abstract class, it will be called when child class object got created
	// In interfaces we cannot create a methods with body but in abstract class we can
	// with interfaces we can get 100 abstraction, But with abstract class we can get 0 to 100 %
	// In abstract class we can have abstraction methods & non ab methods & static and non static methods
	
	
	public Page() { 
		System.out.println("Page---Const");
	}
	
	public abstract void header();
	
	public abstract void title();
	
	
	public static void logo() { // static method cannot be override
		System.out.println("Page----Logo");
	}

	public void display() {
		System.out.println("Page---display");
	}
	
	
	
	
	
	
}
