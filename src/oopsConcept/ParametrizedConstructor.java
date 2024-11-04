package oopsConcept;

public class ParametrizedConstructor {
int a = 10;
	public ParametrizedConstructor(int a) {
		this.a = a;
		System.out.println("global value of A : "+this.a);
	}
	
	public static void main(String[] args) {
		
		ParametrizedConstructor p = new ParametrizedConstructor(5);
		new ParametrizedConstructor(15);

	}

}
