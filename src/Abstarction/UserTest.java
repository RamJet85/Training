package Abstarction;

public class UserTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(); 
		// when u create the object by default const executed, 
		// i've created both page and loginpage const when i execute first parent class const will be executed 
		//after that child class const will be executed
		
		lp.header();
		lp.title();
		lp.doLogin();
		lp.doLogin("Ram", "Ram@123");
		lp.display();
		Page.logo();
		
		//Top casting Child class object can be referred by parent class ref variable
		Page p = new LoginPage();
		
		p.display();
		p.header();
		p.title();
		Page.logo();
		p.display();
		
		
		
		
	}

}
