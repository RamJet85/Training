package Programs;

public class switchs {

	public static void main(String[] args) {

		
		switchs sw = new switchs();
		sw.launchBrowser("Operamini");
		
		
		
	}
	
	public void launchBrowser(String browser) {
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome browser");
			
			break;
			
		case "firefox":
			System.out.println("Launch firefox browser");
			
			break;
			
		case "ie":
			System.out.println("Launch ie browser");
			
			break;

		default:
			System.out.println(browser+ " Browser not found");
			break;
		}
		
		
	}

}
