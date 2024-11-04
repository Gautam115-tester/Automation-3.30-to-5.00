package oopsConcept;
public class SingleInh {
	public static void main(String[] args) {	
		Subclass s = new Subclass();
		s.QualityOfCommons();
		s.QualityOfUnique();
		
		Superclass s1 = new Superclass();
		s1.QualityOfCommons();
		
	}
}
class Superclass{	
	public void QualityOfCommons() {
		System.out.println("This is an demo code of Superclass");
	}	
}
class Subclass extends Superclass{	
	public void QualityOfUnique() {
		System.out.println("This is an demo code of sub class");
	}	
}