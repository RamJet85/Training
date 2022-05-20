package Abstarction;

public abstract class Page { // a class which is defined with abstract keyword it is called abstract class
	
	// Data abstraction is the process of hiding certain details and showing only essential information to the user. 
	// Abstraction can be achieved with either abstract classes or interfaces 
	// a method which is having no method body is called abstraction methods
	// We cannot create the object of abstract class & interface
	// We can create the constructor for abstract class, it will be called when child class object got created
	// In interfaces we cannot create a methods with body but in abstract class we can
	// with interfaces we can get 100 abstraction, But with abstract class we can get 0 to 100 %
	// In abstract class we can have abstraction methods & non ab methods & static and non static methods
	
	
	//Interface is a blue print of a class
	// It is used to achieve abstraction, By interface, we can support the functionality of multiple inheritance.
	// Interface cannot have method body only prototype
	// Interface cannot create the object
	// In interface the variables are by default in static and final nature
	// static methods we cannot override and static methods are not allowed in interfaces, 
	// default methods are available in only interfaces not in classes
	// default method can be overriden by without default key
	
	
	public Page() { 
		System.out.println("Page---Const");
	}
	
	public abstract void header();{
		System.out.println("team");
	}
	
	public abstract void title();
	
	
	public static void logo() { // static method cannot be override
		System.out.println("Page----Logo");
	}

	public void display() {
		System.out.println("Page---display");
	}
}
