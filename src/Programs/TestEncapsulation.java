package Programs;

public class TestEncapsulation {

	public static void main(String[] args) {
		
		
		Encapsulation cp = new Encapsulation("Anusha", 25, "TCS", 'F', 3.5);
		System.out.println(cp.name+" "+cp.age+" "+cp.company+" "+cp.gender+" "+cp.getSalary());
		
		cp.getProjectInfo();
		
		

	}

}
