package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedLocator {

	public static void main(String[] args) {
		
		WebDriver w = new FirefoxDriver();
		w.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		w.findElement(By.cssSelector("input#ap_customer_name")).sendKeys("abcd");
		w.findElement(By.cssSelector("input.a-input-text.a-span12.a-spacing-micro.auth-required-field.auth-require-phone-validation")).sendKeys("9876543210");
		w.findElement(By.cssSelector("input[class=\"a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation\"]")).sendKeys("1");
	}

}


