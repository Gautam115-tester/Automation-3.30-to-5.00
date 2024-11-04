package basic.java;

public class StringEqualsIgnoreCaseMethod {

	public static void main(String[] args) {
		
		String str = "Hello ";
		String str1 = "hello ";
		
		boolean equalsIC = str.equalsIgnoreCase(str1);
//		EqualsIgnorecase method is not case sensitive.
		System.out.println(equalsIC);
		
		if (equalsIC) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
		

	}

}
