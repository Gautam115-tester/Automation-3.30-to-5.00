package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethod {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);	
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}
	
	/*
	 * 1. open first site using get method  (amazon)
	 * 2. open another site using navigate method  (meesho)
	 * 3. navigate throught back
	 * 4. title capture verification
	 * 5. navigate to forward 
	 * 6. url capture verification.
	 */

}
