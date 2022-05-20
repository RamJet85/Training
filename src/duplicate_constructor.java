
public class duplicate_constructor {

	int age;
	String name;
	double salary;
	
	
	public duplicate_constructor(int age) {
		
		this.age = age;
		
	}
	
    public duplicate_constructor(int age, String name) {
		
		this.age = age;
		this.name = name;
		
	}
 
    public duplicate_constructor(int age, String name, double salary) {
		
    	this.age = age;
		this.name = name;
		this.salary = salary;
		
	}
	
	
	
	public static void main(String[] args) {
		
		duplicate_constructor dc = new duplicate_constructor(28);
		System.out.println(dc.age);
		duplicate_constructor dc1 = new duplicate_constructor(28, "Ram");
		System.out.println(dc.age+" "+dc.name);

	}

}
