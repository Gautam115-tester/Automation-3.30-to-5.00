package oopsConcept;

public class ExceptionHandling {

	public static void main(String[] args) {
		
//		int i = 10;
//		int j = 0;
//		
//		try {
//			System.out.println(i/j);
//		} catch (Exception e) {
//			System.out.println("hello");
//		}
		
		String str = "1234.5";
		
		try {
			System.out.println("do");
			int i = Integer.parseInt(str);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("hello");
		}
		

	}

}
