import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTestExtra {

private static WebDriver driver = new FirefoxDriver();
	
	@BeforeClass
	public static void beforeClass() {
		driver.get("http://store.demoqa.com/");
	}
	
	@AfterClass
	public static void afterClass() {

		
		driver.close();
	}
	
	@Test
	public void testCheckout() {
		
//		a. Tom varukorg
		
//		i. Verifiera att texten ”Oops, there is nothing in your cart.” visas 
		driver.get("http://store.demoqa.com/products-page/checkout/");
		
		
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='entry-content']"), "Oops, there is nothing in your cart."));
		
//		ii. Verifiera att ”Continue”-knappen inte syns
		
		if(!driver.findElements(By.xpath("//*[@id='checkout_page_container']")).contains("continue")){
			System.out.println("Continue button is not visible");

			}else{
				System.out.println("Continue button is visible");
		    }	
		
	}

}
