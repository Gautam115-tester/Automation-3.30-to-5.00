package basic.java;

public class ArrayExample {

	public static void main(String[] args) {
//	1.	
		int a[] = {10,20,30,70,80,40,50,60};  // array store value as individual
		
		System.out.println(a[3]);
		
		int len = a.length;
		
		System.out.println("Length of array A is "+len);
		
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		
//		2.
		    int[] b = new int[5];
		    
		    b[0] = 10;
		    b[2] = 30;
		    b[4] = 50;
		    b[1] = 60;
		    System.out.println();
//		                      {10,60,30,0,50}
		    for(int var : b) {
		    	System.out.println(var);
		    }

	}

}
