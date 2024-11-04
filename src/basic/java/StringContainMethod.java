package basic.java;

public class StringContainMethod {

	public static void main(String[] args) {
		
		String str = "hello";
		String str2 ="he";
		
		boolean contain = str.contains(str2);
		
		System.out.println(contain);
		
		if (contain) {
			System.out.println("character match has been found");
		} else {
			System.out.println("character match has been not found");
		}

	}

}
