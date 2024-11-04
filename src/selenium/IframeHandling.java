package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		w.findElement(By.id("displayed-text")).sendKeys("hello");
//		this statement is used to move from main page to the iframe.
//		w.switchTo().frame("courses-iframe");  // Id or name
//		we used it with any webelement.
	WebElement	iframe = w.findElement(By.cssSelector("iframe[src=\"https://rahulshettyacademy.com/\"]"));
	w.switchTo().frame(iframe);
		Thread.sleep(2000);
		w.findElement(By.linkText("Mentorship")).click();
//		this statement of code is used to move to main page 
		w.switchTo().parentFrame();
		Thread.sleep(2000);
		w.findElement(By.id("displayed-text")).clear();
		

	}

}
