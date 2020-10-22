package Java_Practice;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		
		Encapsulation cap = new Encapsulation("HDFC head-Office","Madhapur", 2000);
		
		System.out.println(cap.bankName);
		System.out.println(cap.branch);
		System.out.println(cap.getBalance());
		cap.getempDada();
	}

}
