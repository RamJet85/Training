package Java_Practice;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
//HashMap is a class, It implements the Map interface which is used to store key and value pairs, 
//where keys should be unique. If you try to insert the duplicate key, it will replaced the previous key with the latest key. 
//It is easy to perform operations using the key index like updation, deletion, etc.
//Hashmap should be in key and value format, it is not index based 
//we can store null values In hashmap we can have no of null values but we have only one null key if more than 1 it will replace with new key
	//whenever you need key and value pairs	
	 
	  java.util.HashMap<Integer, String> maps = new java.util.HashMap<Integer,String>();
	  
	 //hashmap also not thread safe, not synchronised
	  
	  
	  maps.put(1, "Ram");
	  maps.put(2, "Charan");
	  maps.put(3, "Testing");
	  maps.put(null, "Krishna");
	  maps.put(null, "india");
	  maps.put(1, "Ram");//duplicate key
	  // to get the value use get method
	  System.out.println(maps.get(1));
	  System.out.println(maps.get(89)); 
	  
	  // if you don't have key u should get null
	  
	  //Entry set will give u the each pair 
	  
	  for(Map.Entry<Integer, String> e:maps.entrySet()) {
		  System.out.println(e.getKey()+ " "+e.getValue());
		 
	  }
	  
	  //To get only keys using keySet
	  for (Integer s1 : maps.keySet()) {
		System.out.println("key = "+s1);
	  }
	  
	  //To get only values using 
	  
	  for(String s2 : maps.values()){
		  System.out.println("values "+s2);
	  }
	  
	  
	 }

}
