package oopsConcept;

public class MethodOverloading {
	
	
	public void emailAndPhoneno(String email) {
		if (email.equals("xyz@qst.com")) {
			System.out.println("Email is exisiting");
		} else {
			System.out.println("Email is not exisiting");
		}
	}
    public void emailAndPhoneno(int phone) {
		System.out.println("This code is for phone number verification");
	}
	

	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.emailAndPhoneno(1234567890);

	}

}
