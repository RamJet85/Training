package Java_Practice;

import java.util.ArrayList;

public class Methods {

	public static void main(String[] args) {

    //Method is just a block of code, used to perform actions 
    //the usage of method is to re usability, define the code once, and use it many times.
    //Execution will starts always from main method, two types of methods we have static & non static method
    //Object is an entity that has state and behaviors ex car is an object model represents 
	//the state and driving represents the behavior 
	//Methods can return arrays, Inside a main method u cannot create a method
	//Object is a physical entity which will hold all the properties of a class, ph is a category (class) and ios 10 is an Object
	//Class is collection or group of objects like methods constructors variables. or 
	//A class is a group of objects which have common properties.
		
		System.out.println("Main method");
		Methods obj = new Methods();
		
		int return_c = obj.add();
		System.out.println("The add value of c is: "+ return_c);
		
		System.out.println(obj.studentname());
		int sumvalues = obj.sumMethod(10, 20);
		System.out.println(sumvalues);
		int sumvalues2 = obj.sumMethod(20, 30);
		System.out.println(sumvalues2);
		
		double dd = obj.multiplication(2.5, 3.5);
		System.out.println(dd);
		
		//obj.getStudentMarks("Ram");
		//System.out.println(obj.getStudentMarks("Ram"));
		
		String strst[] = obj.getBranchName("cse");
		for (String st : strst) {
			System.out.println(st);
			
		}
		ArrayList<String> str2 = obj.getProductlist("flipkart");
		for (String sg : str2) {
			System.out.println("The product details are "+sg);

			
//			different types to print the values
//			str2.forEach(ele->System.out.println(ele));
			
		}
		
	}
	//no input but some return, Input means parameters
	public int add() {
		int a =10;
		int b =20;
		int c =a+b;
		return c;
	}

	//no input but return some 
	public String studentname() {
		
		String name1 ="Ram";
		String name2 ="Krishna";
		String fullname =name1+name2;
		return fullname;	
	}
	
	//some input, some return
	public int sumMethod(int x, int y) {
		
		int z=x+y;
		return z;
		}
	
	public double multiplication(double d1, double d2) {
		
		double d3 = d1+d2;
		return d3;
		}
	
	public int getStudentMarks(String name) {
		System.out.println("get student marks for "+name);
		
		int marks =-1; // assume that -1 is not available in database
		if(name.equalsIgnoreCase("Ram")) {
			marks =96;
		}
		else if(name.equalsIgnoreCase("Ravi")) {
			marks =34;
		}
		else if(name.equalsIgnoreCase("Charan")) {
			marks = 67;
		}
		else {
			System.out.println(name + " is not found ");
		}
		
		return marks;
	}
	
	// WAM which will take branchName(String) -- return the list of student names (static array)
	
	public String[] getBranchName(String branchName) {
		
		String studentdetails[] = new String[3];
		
		if(branchName.equalsIgnoreCase("CSE")) {
			
			studentdetails[0]= "Ram";
			studentdetails[1]="Charan";
			studentdetails[2]="Anusha";
			}
		
		else if(branchName.equalsIgnoreCase("ECE")) {
			
			studentdetails[0]= "HariRam";
			studentdetails[1]="HariCharan";
			studentdetails[2]="SaiAnusha";
			}
		return studentdetails;
		
	} 
//	String strst[] = obj.getBranchName("cse");
//	for (String st : strst) {
//		System.out.println(st);
	
	//WAM which will take ecom site name , then return all the list of products
	
	public ArrayList<String> getProductlist(String SiteName) {
		
		System.out.println("Get the list of products from "+SiteName);
		
		ArrayList<String> Prodlist = new ArrayList<String>();
		
		if(SiteName.equalsIgnoreCase("flipkart")) {
			Prodlist.add("Apple Mac pro");
			Prodlist.add("Iphone 11 pro");
			Prodlist.add("Iphone 10 X");
			}
		else if(SiteName.equalsIgnoreCase("amazon")) {
			Prodlist.add("Samsung Mac pro");
			Prodlist.add("Redme 11 pro");
			Prodlist.add("Real me 10 X");
			}
		else {
			System.out.println("Product list is not available from "+SiteName);
		}
		
		return Prodlist;
		
		
		
	}
	
	
	
	

}
