package Abstarction;

public class Homepage extends Page{

	@Override
	public void header() {
		System.out.println("Home---header");
		
	}

	@Override
	public void title() {
		System.out.println("Home---tilte");
		
	}
	
	public void dashBoard() {
		System.out.println("Home--- dashBoard");
	}
    
	@Override  // from page class non static method
	public void display() {
		System.out.println("HomePage---display");
	}
}
