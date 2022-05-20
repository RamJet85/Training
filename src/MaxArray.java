
public class MaxArray {

	public static void main(String[] args) {
		
		int array[] = {12,34,76,56,654};
		
		int max = Integer.MIN_VALUE; // Min_Value
		
		for (int ele : array) {
			
			if(ele>max){ //ele<min
				max = ele;
			}
			
		}
		System.out.println(max);

	}

}
