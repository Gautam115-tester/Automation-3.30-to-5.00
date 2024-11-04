package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NormalLocatorWithLinkTextAndPartialLinkText {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new FirefoxDriver();
		w.get("https://www.amazon.in/");
		Thread.sleep(2000);
		w.findElement(By.partialLinkText("Best Sel")).click();

	}

}
