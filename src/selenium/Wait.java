package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://github.com/signup");
//		Thread.sleep(10000);
//		Implicity wait 
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		w.findElement(By.id("email")).sendKeys("qst@gmail.com");
		w.findElement(By.xpath("//*[@id=\"email-container\"]/div[2]/button")).click();
		
		
////		Explicity wait
//
//		WebDriverWait wdw1 = new WebDriverWait(w, Duration.ofSeconds(8));
//		wdw1.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("qst@gmail.com");
//		
//		WebDriverWait wdw = new WebDriverWait(w, Duration.ofSeconds(3));
//		wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"email-container\"]/div[2]/button1"))).click();

	}

}
