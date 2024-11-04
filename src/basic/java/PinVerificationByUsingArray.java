package basic.java;

import java.util.Scanner;

public class PinVerificationByUsingArray {

	public static void main(String[] args) {
	
		int pin[] = {1234,1458,6547,1478,1235};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin : ");
	    int userpin = sc.nextInt();
		
	     for (int i = 0; i < pin.length; i++) {
			if (userpin==pin[i]) {
				System.out.println("Access Granted");
				return; 
			}
			
		}
	     System.out.println("Access Denied");

	}

}
