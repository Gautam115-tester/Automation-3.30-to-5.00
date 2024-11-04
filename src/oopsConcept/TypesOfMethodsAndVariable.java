package oopsConcept;
public class TypesOfMethodsAndVariable {
	int b = 150; // global or class variable  --> access in class
	static int d = 999; // static variable
	public void add() { // normal and non static method
		int a = 10 ,b = 20 ; // local variable --> access in the method only
		System.out.println("a+b = "+(a+b));
	}
	public int sub() {  // return type
		int a= 20  ;
		return a-b;
	}
	public void multi(int a ) { // parameterized method
		System.out.println("a*b = "+a*b);
	}
	public static void main(String[] args) {  // main method
	TypesOfMethodsAndVariable	 m = new TypesOfMethodsAndVariable();
		m.add();
		m.add();
		System.out.println(m.sub());
		System.out.println(" sub of 2 var is "+m.sub());
//                             10 - 1
		System.out.println("a-b = "+(m.sub()-1));
		m.multi(50);
		m.multi( 100);
		System.out.println(m.b);
		System.out.println(d);
	}
//	non static method you want to call at static method you need to create an instance (copy) of that method.

}
