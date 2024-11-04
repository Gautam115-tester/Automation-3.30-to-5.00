package oopsConcept;
interface A {	
	public void qualityOfA();
}
interface B{
	public void qualityOfB();
}
class C implements A , B{
	public void qualityOfC() {
		System.out.println("This code belong to quality of C class");
	}
	@Override
	public void qualityOfB() {
		System.out.println("This code belong to quality of B interface");	
	}
	@Override
	public void qualityOfA() {
		System.out.println("This code belong to quality of A interface");	
	}	
}
public class MultipleInh {
	public static void main(String[] args) {
		C c = new C();
		c.qualityOfC();
		c.qualityOfB();
		c.qualityOfA();
	}
}