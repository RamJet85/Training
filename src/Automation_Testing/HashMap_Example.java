package Automation_Testing;

import java.util.HashMap;

public class HashMap_Example {
	
	static HashMap<String, String> map;

	public static void main(String[] args) {
		// Hashmap with different logins
		
		map = new HashMap<String, String>();
		
		map.put("Fraudshare", "ram@user.com: ram@123");
		map.put("CompanyAdmin", "ram@cadmin : cadmin@123");
		map.put("LLGAdmin", "ram@llgadmin: llgadmin@123");
		
		HashMap_Example hash = new HashMap_Example();
		hash.dologin("LLGAdmin");

	}
	
	public void dologin(String role) {
		
		String username = map.get(role).split(":")[0].trim();
		String password = map.get(role).split(":")[1].trim();
		
		System.out.println("login with "+username + " and "+ password);
		
		
	}

}
