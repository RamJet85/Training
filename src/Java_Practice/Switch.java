package Java_Practice;

public class Switch {

	public static void main(String[] args) {
		// Switch statement is used to select one of many code to be executed
		// switch statement executes one statement from multiple conditions on the basis of the key that you are passing
		// Break will stop the execution it will come out of the switch block, if the case is matched it will save the execution time
		// Default if no match is found, The default block will executed
	
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default:
			  System.out.println("None of the above");
		}
	}
}