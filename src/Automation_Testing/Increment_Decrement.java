package Automation_Testing;

public class Increment_Decrement {

	public static void main(String[] args) {

		//post increment, Increase the value later
		int a =25;
		int b =a++;
		
		System.out.println(a);//26
		System.out.println(b);//25
		
		//pre increment, Increase the value first
		
		int c = 12;
		int d = ++c;
		System.out.println(c);//13
		System.out.println(d);//13
		
		//Post decrement, decrease the value later
		
		int e =18;
		int f=e--;
		System.out.println(e);//17
		System.out.println(f);//18
		
		//pre decrement, decrese the value first
		
		int g = 32;
		int h = --g;
		System.out.println(g);//-31
		System.out.println(h);//-31
		
		
		
	}

}
