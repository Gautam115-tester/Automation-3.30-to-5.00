package oopsConcept;

public class DefaultConstructor {
int a = 10;
// Default constructor
	public DefaultConstructor() {
		System.out.println("Number value of an A is "+a);
	}
//	Normal method
	public void demo() {
		System.out.println("This is an normal method");
	}
	public static void main(String[] args) {
		DefaultConstructor d = new DefaultConstructor();
		d.demo();
		d.demo();
		d.demo();
		new DefaultConstructor();
		new DefaultConstructor();
		

	}

}
