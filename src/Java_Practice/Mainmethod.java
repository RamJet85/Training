package Java_Practice;

public class Mainmethod {

	public static void main(String[] args) {
		
		
	//public--> if a method or class is having any public keyword, access modifier it can be used anywhere in the program
	//Static--> Static can be called directly without creating the object
	//Void--> Won't return anything
	//main--> name of the method
	//String--> String is a class-->  

	}

}

//What is access modifier:
//specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, 
//constructors, methods, and class by applying the access modifier on it.

//public:It is an access specifier. We should use a public keyword before the main() method 
//so that JVM can identify the execution point of the program. If we use private, protected, 
//and default before the main() method, it will not be visible to JVM.

//Protected: The access level of a protected modifier is within the package and outside 
//the package through child class. If you do not make the child class, it cannot be accessed from outside the package.

//Public: The access level of a public modifier is everywhere. It can be accessed from within the class, 
//outside the class, within the package and outside the package.


//public: It is an access specifier. We should use a public keyword before the main() method so that JVM can identify 
//the execution point of the program. If we use private, protected, and default before the main() method, it will not be 
//visible to JVM.


//static: You can make a method static by using the keyword static. We should call the main() method without 
//creating an object. Static methods are the method which invokes without creating the objects, so we do not need any 
//object to call the main() method.

//void: In Java, every method has the return type. Void keyword acknowledges the compiler that main() method does not 
//return any value.

//main(): It is a default signature which is predefined in the JVM. It is called by JVM to execute a program 
//line by line and end the execution after completion of this method. We can also overload the main() method.


//String args[]: The main() method also accepts some data from the user. It accepts a group of strings, which is called 
//a string array. It is used to hold the command line arguments in the form of string values.



