package Programs;

import java.util.ArrayList;

public class Methods {

	public static void main(String[] args) {
		
		Methods m1 = new Methods();
		ArrayList<Object> array = m1.getBranchName("cse");
		
		System.out.println(array.size());
		
		for (Object obj : array) { // datatype variable name array
			System.out.println(obj);
			
		}
		
		
	}
	public ArrayList<Object> getBranchName(String branch) {
		
		ArrayList<Object> list = new ArrayList<>();
		
		if(branch.equalsIgnoreCase("cse")) {
			list.add("Ram");
			list.add("charan");
			list.add("team");
		}
		
		else if(branch.equalsIgnoreCase("ECE")) {
			list.add("tv");
			list.add("newton");
			//list.add("Ridge");
		}
		
		else {
			System.out.println(branch +" is not available");
		}
		return list;
		
		
		
	}

}
