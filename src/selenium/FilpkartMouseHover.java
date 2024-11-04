package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FilpkartMouseHover {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new FirefoxDriver();
		w.get("https://www.flipkart.com/");
		Thread.sleep(5000);
	WebElement e =	w.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/span/span[2]"));
		Actions act = new Actions(w);
		act.moveToElement(e).perform();
		
		WebElement gaming = w.findElement(By.linkText("Gaming"));
		
		act.moveToElement(gaming).perform();
		
		WebElement games = w.findElement(By.xpath("/html/body/div[4]/div[2]/object/a[6]"));
		
		act.moveToElement(games).click().perform();

	}

}
