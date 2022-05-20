package Java_Practice;

public class Loops_for_while {

	public static void main(String[] args) {
		
		//When you know exactly how many times you want to loop through a block of code, 
		//use the for loop instead of a while loop:
		//Loops are used to execute a set of instructions or functions repeatedly when some conditions become true
		// For, While, Do while loops we have 
		//Loops are used when we have a set of multiple data like arrays or collections
		// we do check condition first in while loop and then statement with a loop. 
		//But in do-while loop, its always a statement first then while loop with a condition.  
		
		//print all 1 to 10 numbers 
		int i =1;
		while(i<=10) {
			System.out.println("The value of i is: "+i);	
			i =i+1;
		}
		//Print only odd even numbers form 1 to 10
		int j =1;
		while(j<10) {
			System.out.println("The value of i is: "+j);	
			j =j+2;
			}
		int k=1;
		while(k<=10) {
			System.out.println(k);
			if(k%2==0) {
				System.out.println("Hi");
			}
			k++;
		}
		System.out.println("****For loop Started****");
		
		//or u can declare like 
		//int l=1; for (l=1;l<10;l++)
		for(int l=1;l<10;l++) {
			System.out.println(l);
			
		}
		//To print the alphabets from a to z
		System.out.println("*** A to Z ***");
		char ch = 'a';
		for(ch='a';ch<='z';ch++) {
			System.out.println(ch);
			
		}
		
		//do-while 
		System.out.println("do-while loop");
		
		int n=6;
		do {
			System.out.println(n);
			n++;
		}
		while(n<=10);
		
		}
		
		
		

	}

