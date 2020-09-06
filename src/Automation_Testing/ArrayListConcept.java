package Automation_Testing;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//Virtual capacity of array list is 10 size
		//When ever u are created an array list java automatically create 10 equal parts inside the memory virtual capacity
		//physical capacity increase then virtual capacity decreased if u enter 2 pc's and now vc is 8 
		//if u want restrict ur data u can use generics

		ArrayList list = new ArrayList();
		list.add("Ram");
		list.add(100);
		list.add(100);
		
		System.out.println(list.get(2));
		System.out.println(list.size());
		
		list.add(12.76);
		list.add('M');
		System.out.println(list.size());
		
		//integer type of data
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(400);
		
		System.out.println(marks.size());
		System.out.println(marks.get(1));
		
		for (Integer integer : marks) {
			System.out.println("The integer values are: "+integer);
			}
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("charan");
		names.add("KRP");
		names.add("Eluru");
		//names.add("Eluru");
		System.out.println(names.size());
		System.out.println(names.get(1));
		
		//to print all the values using for each, In for each loop we don't go with indexing
        
		for(String str : names) {
			System.out.println("The array values are: "+str);
			}
		
		// Store all the emp values in an array list using object array
		//Object is a class
		
		ArrayList<Object> emp = new ArrayList<Object>();
		
		emp.add("Ram");
		emp.add(585);
		emp.add('M');
		emp.add(29);
		emp.add(true);
		
		
		System.out.println(emp.size());
		System.out.println(emp.get(3));
		
		for(Object details : emp) { // datatype variable name : collection or list name here variable is pointing to list name (array name )
			System.out.println("The Object array value are: "+details);
		
		if(details.equals("Ram")) {
			System.out.println("Ram is available");
		}
		else if(details.equals(29)) {
			System.out.println("age available");
		}
		else {
			System.out.println("details not available");
		}
			
			
		}
			
		
		}
}
