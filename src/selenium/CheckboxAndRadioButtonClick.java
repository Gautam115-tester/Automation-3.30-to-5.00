package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAndRadioButtonClick {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
//		w.findElement(By.id("checkBoxOption1")).click();
//		Thread.sleep(2000);
//		w.findElement(By.cssSelector("input[value=\"radio1\"]")).click();
		
  
		 List<WebElement> checkbox =  w.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		 for (WebElement ch : checkbox) {
			 Thread.sleep(2000);
			ch.click();
			
		}

	}
}
