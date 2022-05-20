package Java_Practice;

public class Car {
	
	String model;
	String color;
	int price;
	static int wheels =4;
	
    	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.model = "Hyundai";
		c1.color ="Greay";
		c1.price = 85;
	
		System.out.println("The Hyundai details are: "+c1.model+" " + c1.color+" " + c1.price+" " + wheels);
		
		Car c2 = new Car();
		c2.model = "Maruti";
		c2.color = "White";
		c2.price = 60;
		//System.out.println(wheels);
		System.out.println("The Maruti car details are: "+c2.model+" "+c2.color+" "+c2.price+" "+Car.wheels );
		
	}

}
