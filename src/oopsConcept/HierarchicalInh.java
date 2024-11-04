package oopsConcept;
class Father{
	public void QualityOfFather() {
		System.out.println("This method belong to father class");
	}
}
class Son1 extends Father{
	public void QualityOfSon1() {
		System.out.println("This method belong to Son1 class");
	}
}
class Son2 extends Father{
	public void QualityOfSon2() {
		System.out.println("This method belong to Son2 class");
	}
}
class Son3 extends Father{
	public void QualityOfSon3() {
		System.out.println("This method belong to Son3 class");
	}
}
public class HierarchicalInh {
	public static void main(String[] args) {
		Son1 s1 = new Son1();
		s1.QualityOfSon1();
		s1.QualityOfFather();
		System.out.println();
		Son2 s2 = new Son2();
		s2.QualityOfSon2();
		s2.QualityOfFather();
		System.out.println();
		Son3 s3 = new Son3();
		s3.QualityOfSon3();
		s3.QualityOfFather();
	}
}