package basic.java;

import java.util.Scanner;

public class LoginVerification {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Username : ");
		String uname = sc.next();
		System.out.println("Enter Your Password : ");
		String pass = sc.next();
		
		/*
		 * And(&&) -->  true and true = true          OR(||) --> true and true = true
		 *              true and false = false                   false and true = true
		 *              false and true = false                   true and false = true
		 *              false and false = false                  false and false = false 
		 * 
		 */
//		== <-- primitive
		
		if (uname.equals("user1")&&pass.equals("pass1")) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login unsuccessful");
		}

	}

}
