package basic.java;

import java.util.Scanner;

public class PinWithFiniteLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i <=3;i++) {
		System.out.println("Enter your pin");
		int pin = sc.nextInt();
	
		if (pin==1234) {
			System.out.println("Access Granted");
			break;
		}else if (i==3) {
			System.out.println("Your account has been blocked please contact to your nearest bank");
		} else {
			System.out.println("Access Denied");
		}
		}

	}

	
	
	
	
}
