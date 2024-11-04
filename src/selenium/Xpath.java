package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver w = new FirefoxDriver();
		w.get("https://www.facebook.com/");
//		Absolute xPath (copy full xpath)
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("1234567890");
//      relative Xpath  (attribute value should be unique for single perform) (copy Xpath).
		w.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("1");
		
//		//*[@id="pass"]
	}

}
