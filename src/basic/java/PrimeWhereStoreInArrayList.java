package basic.java;

import java.util.ArrayList;

public class PrimeWhereStoreInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();	
		for(int i = 1;i<= 100;i++) {
		 boolean b = true;
			for(int j = 2 ; j < i;j++) {
				if (i%j==0) {
					b = false;
				}
			}
			if (b) {
				list.add(i);
			}	
		}
		System.out.println("List of all prime number from 1 to 100 : "+list);

	}

}
