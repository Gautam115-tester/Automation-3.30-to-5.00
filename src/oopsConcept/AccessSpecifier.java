package oopsConcept;
// public --> visibility will be on full project.
// protected --> visibility will be on it's own package and also
//if you want to access protected in different package class then you need inheritance.
// private --> visibility will be only it's own class.
// Default --> visibility will be only at it's own package 

public class AccessSpecifier {
	public String name = "xyz";
	public void username() {
		System.out.println("Name of the user is "+name);
	}	
	protected String mail = "xyz@yahoo.com";
	protected void contact() {
		System.out.println("Mail id of the user is "+mail);
	}
	private int salary = 30000;
	private void salary() {
		System.out.println("user get this month salary amount is "+salary);
	}	
	String ID = "STA019";
	void id() {
		System.out.println("User working id is "+ID);
	}	
	public static void main(String[] args) {
		AccessSpecifier a = new AccessSpecifier();
		a.username();
		a.contact();
		a.salary();
		a.id();
	}
}
