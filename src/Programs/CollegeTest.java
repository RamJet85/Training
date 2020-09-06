package Programs;

public class CollegeTest {

	public static void main(String[] args) {
		
		
		CollegeEn en = new CollegeEn();
		// first u have to set the data and next get the data
		
		en.setName("Ram");
		en.setRollno(101);
		en.setGrades("A+");
		
		System.out.println(en.getName());
		System.out.println(en.getRollno());
		System.out.println(en.getGrades());
		
		System.out.println("*********");
		
		en.setName("Charan");
		en.setRollno(102);
		en.setGrades("B+");
		
		System.out.println(en.getName());
		System.out.println(en.getRollno());
		System.out.println(en.getGrades());
		
	}

}
