package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new FirefoxDriver();
		w.get("https://www.meesho.com/");
	WebElement men =	w.findElement(By.xpath("/html/body/div/div[2]/div[4]/div/div[5]/span"));
	WebElement Wallets = w.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/div[6]/div/div[3]/a[4]/p"));
	Actions act = new Actions(w);
	Thread.sleep(2000);
	act.moveToElement(men).perform();
	Thread.sleep(2000);
	act.moveToElement(Wallets).click().perform();
	

	}

}
