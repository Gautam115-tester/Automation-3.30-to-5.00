package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new FirefoxDriver();
		w.get("https://www.facebook.com/signup");
		
		
		Select s1 = new Select(w.findElement(By.id("day")));
		Thread.sleep(2000);
		for(int i = 0 ; i< 5;i++) {
			Thread.sleep(1000);
		s1.selectByIndex(i);  // int
		}
		Thread.sleep(2000);
		s1.selectByValue("17"); // String
		Thread.sleep(2000);
		s1.selectByVisibleText("26");  // String

	}

}
