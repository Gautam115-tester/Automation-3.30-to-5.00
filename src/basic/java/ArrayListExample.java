package basic.java;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("xyz@123");
		list.add("abc987");
		list.add("username");
		
		for(int i = 0;i<=1;i++) {
		if (list.get(i).equals("username")) {
			System.out.println("Username is Existing");
			return;
		} 
		}
//		break will basically break the loop and switch and come outside of it.
//		return will basically come out of your method.
		System.out.println("Username is not Exisiting");

	}

}
