package oopsConcept;
interface A1{
	public void qualityOfA1();
}
interface B1 extends A1{
	public void qualityOfB1();
}
interface C1 extends A1{
	public void qualityOfC1();
}
class D1 implements B1 ,C1{
	public void qualityOfD1() {
		System.out.println("This code belong to quality of D1 class");
	}
	@Override
	public void qualityOfA1() {
		System.out.println("This code belong to quality of A1 interface");	
	}
	@Override
	public void qualityOfC1() {
		System.out.println("This code belong to quality of C1 interface");	
	}
	@Override
	public void qualityOfB1() {
		System.out.println("This code belong to quality of B1 interface");	
	}
}
public class HybridInh {
	public static void main(String[] args) {	
		D1 d = new D1();
		d.qualityOfD1();
		d.qualityOfC1();
		d.qualityOfB1();
		d.qualityOfA1();
		

	}

}
