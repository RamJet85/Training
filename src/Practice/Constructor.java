package Practice;

public class Constructor {
	
	//Constructor
	//Instance Variables
	int age;
	String name;
	double salary;
	
	public Constructor(int age) {
		
		this.age =age;
	}
	
    public Constructor(int age, String name) {
		
		this.age =age;
		this.name = name;
	}
    
    public Constructor(int age, String name, double salary) {
		
		this.age =age;
		this.name = name;
		this.salary = salary;
	}
	
	
	public static void main(String[] args) {
		
		Constructor c1 = new Constructor(28);
		System.out.println(c1.age);
		
		Constructor c2 = new Constructor(28, "Ram");
		System.out.println(c2.age+" "+c2.name);
		
		Constructor c3 = new Constructor(28, "Ram", 12.34);
		
		System.out.println(c3.age+" "+c3.name+" "+c3.salary);
		
		
		
		
		
		
		
		
	}

}
