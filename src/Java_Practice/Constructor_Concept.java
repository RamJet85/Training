package Java_Practice;

import java.util.ArrayList;

public class Constructor_Concept {
	
	String name;
	int age;
	int empID;
	double salary;
	boolean isPermanent;
	String role;
	String companyName;
	ArrayList<Object> devicelist;
	
	// In methods suppose u want to use instance variables u should create object but 
	//in constructor u can use all class variables or some class variables
	
	public Constructor_Concept(String name, int empID, String role) {
		
		//whenever the local and global variables names are same to avoid the confusion between we should use this keyword
		// this is always refers to the current class, it used to access the instance variables		
	}
	
	public Constructor_Concept(String name, String role, int age) {
		
		this.name = name;
		this.role = role;
		this.age = age;
		
		
	}
	
	public Constructor_Concept(String s, double d) {
		
		System.out.println("parm constructor "+s+" " + d);
		
		}
	
	public Constructor_Concept(String name, int age, int empID, double d, boolean isPermanent, String role,
			String companyName, ArrayList<Object> devicelist) {
		
		this.name = name;
		this.age = age;
		this.empID = empID;
		this.salary = d;
		this.isPermanent = isPermanent;
		this.role = role;
		this.companyName = companyName;
		this.devicelist = devicelist;
	}

	public static void main(String[] args) {
		
		//Const is a special type of method, it doesn't have any return type (But method may or may not return any value), 
		//const name must be same as class name
		//It used to initialize the instance variables, const can be executed when creating the object on the basis of 
		//parameters that you have passed, here we don't need to use object reference like (obj)
		//Const can be overloading
		//We cannot create const inside a method
		
		Constructor_Concept c1 = new Constructor_Concept("ram", 10.34);
		
		Constructor_Concept c2 = new Constructor_Concept("Charan","Actor",35);
		
		System.out.println(c2.name);
		System.out.println(c2.role);
		System.out.println(c2.age);
		
		ArrayList<Object> devlist = new ArrayList<Object>();
		
		devlist.add("iPHONE pro 11 max");
		devlist.add(13.5);
		devlist.add("Apple");
		devlist.add("Made in India");
		
		Constructor_Concept c3 = new Constructor_Concept("Tom", 25, 585, 12.4, true, "SDET", "Delloite", devlist);
		System.out.println(c3.name+" "+c3.age+" "+c3.empID+" "+c3.salary+" "+c3.role+" "+c3.companyName+" "+c3.devicelist);

	}

}
