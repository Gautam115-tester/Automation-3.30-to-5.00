package basic.java;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
//DataType Variable = New <-- This keyword used to create new instance (object) 
//Scanner(System.in) <-- Scanner() is an constructor where we can pass parameter and that parameter in here is System.in.
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of A variable : ");
		int a = s.nextInt();
		System.out.println("Enter value of B variable : ");
		int b = s.nextInt();
		int c = a+b;
		System.out.println(a+b);
		System.out.println(c);
//		BODMAS
		System.out.println("Add of 2 var is "+(a+b));
		System.out.println("Sub of 2 var is "+(a-b));
		
		a++;
//		100+1
		System.out.println("Calling value of a after increment is "+a);

		b--;
//		20-1
		System.out.println("Calling value of b after decrement is "+b);
		
		System.out.println(8>10);
		
	}

}
