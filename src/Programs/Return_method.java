package Programs;

import java.util.ArrayList;

public class Return_method {

	public static void main(String[] args) {
		
		Return_method m1 = new Return_method();
		
		String[] n1 = m1.getStudents();
		System.out.println(n1.length);
		System.out.println(n1[2]);
		
		for (String str : n1) {
			System.out.println("The values are "+str);
		}
		
		//m1.devicelist("ios");
		
		ArrayList<Object> list = m1.devicelist("android");
//		System.out.println(list.size());
//		System.out.println(list.get(1));
		
		for (Object obj : list) {
			System.out.println(obj);
			
		}
	}
	
	public String[] getStudents() {
		
		String names[] = new String[3];
		names[0] ="Ram";
		names[1]="trianz";
		names[2]="TCS";
		
		return names;
		
	}
	/**
	 * This method is used to launch the browser on the basis of given browserName
	 * @param device
	 * @return driver
	 */
	
	public ArrayList<Object> devicelist(String device) {
		
		System.out.println("The device name is "+device);
		
		ArrayList<Object> devlist = new ArrayList<Object>();
		
		if(device.equalsIgnoreCase("iOS")) {
		
			devlist.add("iOS 13");
		    devlist.add(13.5);
		    devlist.add("Apple made in India");
		}
		else if(device.equalsIgnoreCase("Android")) {
			
			devlist.add("Android 12");
			devlist.add(12.67);
			devlist.add("Made in USA");
		}
			
			else {
				System.out.println(device+" No device found");
			}
		return devlist;
		
		
		}
	
		
		
		
		
		
		
		
		


}
