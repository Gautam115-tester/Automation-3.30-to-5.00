package basic.java;

import java.util.Scanner;

public class PinWithInfiniteTry {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your pin : ");
			int pin = sc.nextInt();
			if (pin>999&&pin<10000) {
				if (pin==1234) {
					System.out.println("Access Granted");
					break;
				} else {
					System.out.println("Access Denied");
				}	
			}else {
				System.out.println("Pin can't be more than or lesser than 4 digit");
			}
			
		}
		
	}

}
