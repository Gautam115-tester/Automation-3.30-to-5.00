package oopsConcept;

public class NullPointerExceptionHandling  {

	public static void main(String[] args) throws Exception  {
		
		String str = "YES";
		
		try {
			throw new Exception("xyz");
//			System.out.println(str.toLowerCase());
			
		} catch (Exception e) {
			System.out.println("Hello");
			System.out.println(e.getMessage());
		}
		finally {
			Thread.sleep(5000);  // 1000 milliseconds = 1sec
			
		}
		
		

	}

}
