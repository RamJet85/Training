package Java_Practice;

import java.util.ArrayList;

public class This_Keyword {
	
	// This keyword is keyword is used to access the global variables
	
	String name;
	int age;
	int empID;
	double salary;
	boolean isPermanent;
	String role;
	String companyName;
	ArrayList<Object> devicelist;
	
	public This_Keyword(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public This_Keyword(double salary, String role, String companyName) {
		
		this.salary = salary;
		this.role = role;
		this.companyName = companyName;
		
	}
	//We have option here click on right click, select source , click on generate constructor using fields
    public This_Keyword(String name, int age, int empID, double salary, boolean isPermanent, String role,String companyName) {

		this.name = name;
		this.age = age;
		this.empID = empID;
		this.salary = salary;
		this.isPermanent = isPermanent;
		this.role = role;
		this.companyName = companyName;
	}
    
    public This_Keyword(String name, int empID, ArrayList<Object> devicelist) {
    	// Inside the const u can pass static array or dynamic array also
		
		this.name = name;
		this.empID = empID;
		this.devicelist = devicelist;
	}

	public static void main(String[] args) {
		
		This_Keyword keyword = new This_Keyword("Ram",25);
		System.out.println(keyword.name);
		System.out.println(keyword.age);
		
		This_Keyword k2 = new This_Keyword(12.23, "IT", "Trianz");
		System.out.println(k2.salary);
		System.out.println(k2.role);
		System.out.println(k2.companyName);
		
		This_Keyword k3 = new This_Keyword("Charan", 26, 106333, 12.67, true, "SDET", "Trianz");
		
		System.out.println(k3.name+" "+k3.role+" "+k3.isPermanent+" "+k3.companyName);
		
		
		ArrayList<Object> devlist = new ArrayList<Object>();
		devlist.add("iOS iPHONE x");
		devlist.add(13.35);
		devlist.add("Made in USA");
		
		This_Keyword k4 = new This_Keyword("Anusha", 105, devlist);
		System.out.println(k4.devicelist);
		System.out.println(k4.devicelist.size());
		System.out.println(k4.devicelist.get(2));
		

	}

	

}
