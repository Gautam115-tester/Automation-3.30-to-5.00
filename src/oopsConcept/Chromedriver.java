package oopsConcept;

public class Chromedriver extends Webdriver {
	@Override
	public void sendkeys() {
		System.out.println("This code will write on an webpage from chrome browser");	
	}

	@Override
	public void clear() {
		System.out.println("This code will clear value which is writen already on an webpage from chrome browser");
	}
	@Override
	public void click() {
		System.out.println("This code will click on the link or  button in the webpage from chrome browser");	
	}
}