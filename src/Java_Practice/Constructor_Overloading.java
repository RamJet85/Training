package Java_Practice;

public class Constructor_Overloading {
	
	//Employee details, global variables
	String empName;
	int empId;
	boolean isPermanent;
	double salary;
	
	
	public Constructor_Overloading() {
		System.out.println("0 parm const");
	}
	
	public Constructor_Overloading(int i) {
		System.out.println("1 parm const "+i);
	}
	
	public Constructor_Overloading(int i, String name) {
		System.out.println("2 parm const "+i + " "+name);
	}
	
	
	

	public static void main(String[] args) {

		Constructor_Overloading c1 = new Constructor_Overloading(); 
		// whenever the object got created immediately const will execute based on parms that you passing
		
		Constructor_Overloading c2 = new Constructor_Overloading(10); 
		
		Constructor_Overloading c3 = new Constructor_Overloading(20,"Ram"); 
		
		
	}

}
