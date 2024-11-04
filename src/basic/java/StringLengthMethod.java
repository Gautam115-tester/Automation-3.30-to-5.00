package basic.java;
public class StringLengthMethod {
	public static void main(String[] args) {
		String str = "hello everyone";
		int len = str.length();
		System.out.println("Length of the String is "+len);
		if (len<=10) {
			System.out.println(str);
		}
	}
}