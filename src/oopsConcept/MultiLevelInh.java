package oopsConcept;
class GrandParent{
	public void QualityOfGrandParent() {
		System.out.println("This code belong to Grandparent class");
	}
}
class Parent extends GrandParent{
	public void QualityOfParent() {
		System.out.println("This code belong to parent class");
	}
}
class Child extends Parent{
	public void QualityOfChild() {
		System.out.println("This code belong to child class");
	}
}
public class MultiLevelInh {
	public static void main(String[] args) {	
		Child c = new Child();
		c.QualityOfChild();
		c.QualityOfParent();
		c.QualityOfGrandParent();
		System.out.println();
		Parent p = new Parent();
		p.QualityOfParent();
		p.QualityOfGrandParent();
		System.out.println();
		GrandParent gp = new GrandParent();
		gp.QualityOfGrandParent();
		

	}

}
