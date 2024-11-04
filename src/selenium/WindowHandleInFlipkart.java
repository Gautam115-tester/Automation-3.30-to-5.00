package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleInFlipkart {

	public static void main(String[] args) throws Exception {	
		WebDriver w = new FirefoxDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://www.flipkart.com/");
		// keyboard access given to selenium code
		w.findElement(By.cssSelector("input[class=\"Pke_EE\"]")).sendKeys("mobile" , Keys.ENTER); 
		w.findElement(By.cssSelector("img[alt=\"Motorola G34 5G (Ocean Green, 128 GB)\"]")).click();
//		Capture windows ID in String Datatype
	    String parent =	w.getWindowHandle();   // parent window only
	   Set<String> childAndParent = w.getWindowHandles(); // it capture both id parent and child
	   System.out.println(parent);
	   System.out.println(childAndParent);
	   for(String ch : childAndParent) {   // for_each because set doesn't support index concept but for multiple window
		   if (!ch.equals(parent)) {
			w.switchTo().window(ch);   // switch window from parent to child
			System.out.println(ch);
			Thread.sleep(2000);
			w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]")).click();
			
		}
	   }

	}

}
