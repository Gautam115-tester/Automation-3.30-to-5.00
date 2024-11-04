package oopsConcept;

public class CallingCodeFromDriverClass {

	public static void main(String[] args) {
		
		Chromedriver c = new Chromedriver();
		c.sendkeys();
		c.clear();
		c.click();
		
		Firefoxdriver f = new Firefoxdriver();
		f.sendkeys();
		f.clear();
		f.click();
	

	}

}
