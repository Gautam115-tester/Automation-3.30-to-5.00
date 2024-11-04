package basic.java;

import java.util.Arrays;

public class FindSmallestAndGreatestNumberInArray {

	public static void main(String[] args) {
		
		int arr[] = {500,60,-99,5,70,780,20,-800};
		
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("smallest number in array is "+arr[0]);
		
		System.out.println("largest number in array is "+arr[arr.length-1]);

	}

}