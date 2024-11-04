package basic.java;

import java.util.Scanner;

public class EvenAndOddInSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int rem = num%2;
		
		switch (rem) {
		case 0:
			System.out.println(num +" is an even number");
			break;
		default: 
			System.out.println(num+" is an odd number");
			break;
		}

	}

}
