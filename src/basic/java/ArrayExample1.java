package basic.java;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many value you want to insert in array : ");
		int len = sc.nextInt();
		
		int arr[] = new int[len];
		
		System.out.println("Enter value of array element : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Showing all array element : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Reverse value of All array element : ");
		for (int i = arr.length-1;i>=0; i--) {
			System.out.println(arr[i]);
		}
		
		int sum = 0 ;
//		              arr = {10,100,999,50,0,-5}
		for(int s : arr) {
			
//		1.	sum = 0 + 10;
//			sum = 10;
//		}
			
//		2.	sum = 10 + 20;
//			sum = 30;
//			}
			
//		3.	sum = 30 + 30;
//			sum = 60:
	System.out.println(sum);
			sum = sum + s;
		}
		System.out.println("sum of all array element is "+sum);
		
		
		System.out.println("Average of all array element is "+sum/len);
		
		

	}

}

