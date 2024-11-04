package selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementInterfaceMethodForEnable {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://github.com/signup");
		w.findElement(By.id("email")).sendKeys("qst@gmail.com");
		Thread.sleep(2000);
	boolean Continue = w.findElement(By.xpath("//*[@id=\"email-container\"]/div[2]/button")).isEnabled();
	if (Continue) {
		System.out.println("Continue button is Enable");
	} else {
		System.out.println("Continue button is Disable");
	}
	
	TakesScreenshot tss =  (TakesScreenshot) w;
	FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("/home/lab-01-09/Desktop/src.png"));
	
	

	}

}
