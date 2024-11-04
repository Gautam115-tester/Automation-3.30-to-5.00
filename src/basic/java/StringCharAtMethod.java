package basic.java;

public class StringCharAtMethod {

	public static void main(String[] args) {
		
		String str = "hello everyone!";
		
		char firstchar = str.charAt(0);
		System.out.println("First character of the String is "+firstchar);
		
		char lastchar = str.charAt(str.length()-1);
		System.out.println("last character of the String is "+lastchar);
		
		

	}

}
