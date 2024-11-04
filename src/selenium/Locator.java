package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) throws Exception {
		/*
		 * 1.Normal locator
		 *    a)ID
		 *    b)Name
		 *    c)className
		 *    d)linkText
		 *    e)ParitalLinkText
		 * 2.Customized locator
		 *    a)cssSelector
		 *    b)Xpath
		 */
		
		WebDriver w = new FirefoxDriver();
		w.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		w.findElement(By.id("password_step_input")).sendKeys("1234");
//		Alpha numberic value doesn't support in id attribute.
//		w.findElement(By.id("u_0_b_y1")).sendKeys("abc");
		Thread.sleep(2000);
		w.findElement(By.name("reg_passwd__")).clear();
		Thread.sleep(2000);
		w.findElement(By.className("inputtext")).sendKeys("alpha");
		Thread.sleep(2000);
		w.findElement(By.name("websubmit")).click();
		
//		<input id="hello" placeholder = "xyz"> hello </input>
		
//		hello

	}

}
