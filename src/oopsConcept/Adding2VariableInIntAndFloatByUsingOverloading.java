package oopsConcept;

public class Adding2VariableInIntAndFloatByUsingOverloading {

	public void add(int a , int b) {
		System.out.println("Addition of 2 number variable in integer is "+(a+b));
	}
    public void add(double a , double b) {
    	System.out.println("Addition of 2 number variable in decimal is "+(a+b));
	}
	
	public static void main(String[] args) {
		
		Adding2VariableInIntAndFloatByUsingOverloading a = new Adding2VariableInIntAndFloatByUsingOverloading();
		a.add(5, 3.0);

	}

}
