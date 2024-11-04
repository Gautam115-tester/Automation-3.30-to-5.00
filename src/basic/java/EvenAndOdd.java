package basic.java;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = s.nextInt();
		
//		modulus(Remainder)  --> % 
		int i = num % 2;
//		In num!=0 it will check user given value should not be zero. if it is zero then it will execute else block of code.
		if (num!=0) {
			if (i==0) {
				System.out.println(num+" is an even number");
			} else {
				System.out.println(num+" is an odd number");	
		} 
		} else {
			System.out.println(num + " is just an number");
		}
			
		
		
		

	}

}
