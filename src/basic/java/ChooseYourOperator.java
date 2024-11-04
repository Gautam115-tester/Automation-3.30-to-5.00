package basic.java;

import java.util.Scanner;

public class ChooseYourOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A variable : ");
		int a = sc.nextInt();
		
		System.out.println("Enter value of B variable : ");
		int b = sc.nextInt();
		
		System.out.println("Enter your choose : \n1.add \n2.sub \n3.multi \n4.div");
		int op = sc.nextInt();
		
		if (op==1) {
			System.out.println("a+b = "+(a+b));
		}
		else if (op==2) {
			System.out.println("a-b = "+(a-b));
		}
		else if (op==3) {
			System.out.println("a*b = "+a*b);
		}
		else if (op==4) {
			System.out.println("a/b = "+a/b);
		}
		else {
			System.out.println("Invalid operator");
		}
		

	}

}
