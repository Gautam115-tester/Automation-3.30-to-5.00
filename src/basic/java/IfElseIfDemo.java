package basic.java;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if (age>0 && age <13) {
			System.out.println("Kid");
		}
		else if (age >12 && age <19) {
			System.out.println("Teenager");
		}
		else if (age >18 && age <61) {
			System.out.println("adult");
		}
		else if (age >60 && age<101) {
			System.out.println("old");
		}
		else {
			System.out.println("This person given age is invalid");
		}

		
		
		
	}

}
