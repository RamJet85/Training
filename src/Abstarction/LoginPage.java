package Abstarction;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("LoginPage--Const");
	}

	@Override
	public void header() {
        System.out.println("LoginPage---header");		
	}

	@Override
	public void title() {
		System.out.println("LoginPage---title");
		
	}
	
	public void doLogin() { // method overloading
		System.out.println("LoginPage---doLogin");
		
	}

	public void doLogin(String un, String pw) {
		System.out.println("LoginPage---doLogin "+ un + pw);
		
	}
}
