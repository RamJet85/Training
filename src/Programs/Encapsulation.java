package Programs;

public class Encapsulation {
	
	String name;
	int age;
	String company;
	char gender;
	private double salary;
	

	public Encapsulation(String name, int age, String company, char gender, double salary) {
		
		this.name = name;
		this.age = age;
		this.company = company;
		this.gender = gender;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

    public static void main(String[] args) {
    	
    	Encapsulation ep = new Encapsulation("Ram", 26, "Trianz" ,'M' , 8.5);
    	
    	System.out.println(ep.name+" "+ep.age+" "+ep.company+" "+ep.gender+" "+ep.salary);
		
    	ep.projectInfo();
    	//ep.getProjectInfo();
		
	}
    public void getProjectInfo() {
    	projectInfo();
    }
    
    private void projectInfo() {
    	System.out.println("Private information");
    }

}
