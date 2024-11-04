package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebelementInterfaceMethod {

	public static void main(String[] args) {
		
		WebDriver w = new FirefoxDriver();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		w.findElement(By.id("checkBoxOption1")).click();
boolean select =w.findElement(By.id("checkBoxOption1")).isSelected();

if (select) {
	System.out.println("Webelement is Selected");
} else {
	System.out.println("Webelement is not Selected");
}

	}

}
