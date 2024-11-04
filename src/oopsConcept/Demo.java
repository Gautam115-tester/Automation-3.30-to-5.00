package oopsConcept;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		
		w.get("https://www.amazon.in/");
		w.findElement(By.cssSelector("input#twotabsearchtextbox[placeholder=\"Search Amazon.in\"]")).sendKeys("Mobile",Keys.ENTER);
	    w.findElement(By.linkText("Redmi Note 13 5G (Arctic White, 6GB RAM, 128GB Storage) | 5G Ready | 120Hz Bezel-less AMOLED | 7.mm Slimmest Note Ever | 108MP Pro-grade Camera")).click();
	    String parentwindow = w.getWindowHandle();
	    Set<String> childwindow = w.getWindowHandles();
	    for(String child : childwindow) {
	    	if (!parentwindow.equals(child)) {
				w.switchTo().window(child);
				Thread.sleep(2000);
				WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#add-to-cart-button[name=\"submit.add-to-cart\"]")));
		WebElement addToCart=w.findElement(By.cssSelector("input#add-to-cart-button[name=\"submit.add-to-cart\"]"));
//		JavascriptExecutor jse = (JavascriptExecutor) w;
		((JavascriptExecutor) w).executeScript("arguments[0].click();",addToCart);
			}
	    }
	
	}

}
