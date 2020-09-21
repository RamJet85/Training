package Automation_Testing;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
//HashMap is a class, It implements the Map interface which is used to store key and value pairs, 
//where keys should be unique. If you try to insert the duplicate key, it will replaced the previous key with the latest key. 
//It is easy to perform operations using the key index like updation, deletion, etc.
//Hashmap should be in key and value format, it is not index based 
//we can store null values In hashmap we can have no of null values but we have only one null key if more than 1 it will replace with new key
		
	  java.util.HashMap<Integer, String> map = new java.util.HashMap<Integer,String>();
	  
	  map.put(1, "Ram");
	  map.put(2, "Charan");
	  map.put(3, "Testing");
	  map.put(null, "Krishna");
	  map.put(null, "india");
	  map.put(1, "Ra");//duplicate key
	  
	  System.out.println(map.get(1));
	  //Entry set will give u the set pair 
	 for(Map.Entry<Integer, String> e:map.entrySet()) {
		  System.out.println(e.getKey()+ " "+e.getValue());
		 
	 }
	  
			
		
		
	}

}
