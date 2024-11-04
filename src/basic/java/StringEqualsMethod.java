package basic.java;

public class StringEqualsMethod {

	public static void main(String[] args) {
		String str = "hello ";
		String str2 = "hello ";
		
//		equal method is an case sensitive 
		
		boolean equal = str.equals(str2);
		
		System.out.println(equal);
		
		if (equal) {
			System.out.println("Match found");
		} else {
			System.out.println("Match Not found");

		}
	}
}