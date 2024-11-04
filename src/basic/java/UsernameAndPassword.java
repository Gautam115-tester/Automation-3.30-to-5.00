package basic.java;

import java.util.HashMap;

public class UsernameAndPassword {
	public static void main(String[] args) {
//		Username it is unique It will create on String data type  --> key
//		Password it is not unique It will also Create on String data type.  --> value
		HashMap<String, String> UaP = new HashMap<String, String>();
		UaP.put("abc", "abc@123");
		UaP.put("xyz", "Xyz@123");
		UaP.put("pqr", "abc@123");
		for(String user : UaP.keySet()) {
			if (user.equals("pqr")) {
				if (UaP.get(user).equals("abc@123")) {
					System.out.println("Access Granted");
					return;
				}else {
					System.out.println("Password is Incorrect");
					return;
				}
			}
		}
		System.out.println("Username is not exisiting");

	}

}
