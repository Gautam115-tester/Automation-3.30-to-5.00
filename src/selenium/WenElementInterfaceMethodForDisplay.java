package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WenElementInterfaceMethodForDisplay {

	public static void main(String[] args) {
		
		WebDriver w = new FirefoxDriver();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		w.findElement(By.id("hide-textbox")).click();
	boolean display =	w.findElement(By.id("displayed-text")).isDisplayed();
	if (display) {
		System.out.println("WebElement is display on the webpage");
	} else {
		System.out.println("WebElement is not display on the webpage");
	}

	}

}
