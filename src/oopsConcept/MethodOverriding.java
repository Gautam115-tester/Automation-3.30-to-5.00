package oopsConcept;

class Vehical{
	public void speed() {
		System.out.println("Average speed of an vehical is 40");
	}
}
class Bike extends Vehical{
	public void speed() {
		System.out.println("Average speed of an bike is 70");
	}
}
class Car extends Vehical{
	public void speed() {
		System.out.println("Average speed of an car is 50");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.speed();
		
		Car c = new Car();
		c.speed();
		

	}

}
