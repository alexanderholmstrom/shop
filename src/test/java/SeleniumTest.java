import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

	private static WebDriver driver = new FirefoxDriver();
	
	@BeforeClass
	public static void beforeClass() {
		driver.get("http://store.demoqa.com/");
	}
	
	@AfterClass
	public static void afterClass() {

		
		driver.close();
	}
	
	//Home flik
	
	@Test
	public void testProdukter() {
		
//		i. Verifiera att ”Buy Now”-knappen leder till produktens produktsida
		
		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("prodtitle"));
		
//		ii. Verifiera att man kommer till produktens produktsida om man trycker på bilden
		
		driver.get("http://store.demoqa.com/");
		driver.findElement(By.className("featured_image")).click();
		driver.findElement(By.className("productcol"));
		
//		iii. Verifiera att ”More Info”-länken leder till produktens produktsida
		
//		driver.findElement(By.id("menu-item-15")).click();
		driver.get("http://store.demoqa.com/");
		driver.findElement(By.xpath("//*[@id='slides']")).click();
		driver.findElement(By.id("wrap-all"));
		
//		iv. Verifiera att tre produkter visas i bildspelet och att det bläddras automatiskt
		
		driver.get("http://store.demoqa.com/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[/html/body/div[2]/div/div/div/div/div/div/div[1]/div[2]/a/img]")));

		
		WebDriverWait wait2 = new WebDriverWait(driver, 100);
		wait2.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='price']"), "$12.00"));

//		
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='price']"), "$0.00"));

				
//		v. Verifiera att det går att bläddra manuellt i bildspelet
		
		driver.get("http://store.demoqa.com/");
		
		driver.findElement(By.id("slide_menu")).click();
	}
	
	@Test
	public void testLatestBlogPost() {
		
//		i. Verifiera att ”Latest Blog Post”-sektionen visar produkter
		
		driver.findElement(By.className("footer_featured"));
		driver.findElement(By.xpath("//*[/html/body/div[2]/div/div/footer/section[2]/ul]"));
        
//		ii. Verifiera att produkttitlarna leder till produktens produktsida 
//		iii. Verifiera att man kommer till produktens produktsida om man trycker på bilden
//		iv. Verifiera att ”More Details”-länken leder till produktens produktsida
		
		driver.get("http://store.demoqa.com/");
		
		driver.findElement(By.xpath("//*[@id='footer']")).click();
		driver.findElement(By.xpath("//*[@id='wrapper']"));
		
	//Produktsidor
		
	}
	
	@Test
	public void testProductSide() {
		
		//a Verifiera att produktsidan innehåller
		
//		i   Titel
		
		driver.get("http://store.demoqa.com/products-page/product-category/");
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
//		ii. Produktbeskrivning
		
		driver.findElement(By.className("wpsc_description"));
		
//		iii. Pris 
		
		driver.findElement(By.className("wpsc_product_price"));
		
		
		//b Verifiera att det går att lägga produkten i varukorgen
		
		driver.findElement(By.className("input-button-buy")).click();
		
//		c. Verifiera att det går att betygsätta produkten med sjärnorna:
		
//		i. Varje produkt ska bara kunna betygsättas en gång och då ska texten ”Thanks for rating!” visas 
		
		driver.get("http://store.demoqa.com/products-page/product-category/");
		
		driver.findElement(By.className("product_rating")).click();
//		WebDriverWait wait4 = new WebDriverWait(driver, 10);
//		wait4.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='message']");
	}
	
	@Test
	public void test() {
		
		
		driver.get("http://store.demoqa.com/");
				
	}
	
	@Test
	public void testProductCategory1() {
		
		
		WebElement elementone = driver.findElement(By.linkText("Product Category"));

        Actions one = new Actions(driver);

        one.moveToElement(elementone).perform();

        WebElement Accessories = driver.findElement(By.linkText("Accessories"));

        one.moveToElement(Accessories);

        one.click();

        one.perform();
        
        driver.findElement(By.xpath("//*[/html/body/div[2]/div/div/div/div/div[1]/article/header/h1]"));
        
	}
	
	@Test
	public void testProductCategory2() {

        
        WebElement elementtwo = driver.findElement(By.linkText("Product Category"));

        Actions two = new Actions(driver);

        two.moveToElement(elementtwo).perform();

        WebElement iMacs = driver.findElement(By.linkText("iMacs"));

        two.moveToElement(iMacs);

        two.click();

        two.perform();
        
        driver.findElement(By.xpath("//*[/html/body/div[2]/div/div/div/div/div[1]/article/header/h1]"));
        
	}
	
	@Test
	public void testProductCategory3() {


        
        WebElement elementthree = driver.findElement(By.linkText("Product Category"));

        Actions three = new Actions(driver);

        three.moveToElement(elementthree).perform();

        WebElement iPads = driver.findElement(By.linkText("iPads"));

        three.moveToElement(iPads);

        three.click();

        three.perform();
        
        driver.findElement(By.xpath("//*[/html/body/div[2]/div/div/div/div/div[1]/article/header/h1]"));
        
        
	}
	
	@Test
	public void testProductCategory4() {

		WebElement elementfour = driver.findElement(By.linkText("Product Category"));

        Actions four = new Actions(driver);

        four.moveToElement(elementfour).perform();
        
		WebElement iPhones = driver.findElement(By.linkText("iPhones"));

        four.moveToElement(iPhones);

        four.click();

        four.perform();
        
        driver.findElement(By.xpath("//*[/html/body/div[2]/div/div/div/div/div[1]/article/header/h1]"));
        
        
	}
		
	@Test
	public void testProductCategory5() {
		
		WebElement elementfive = driver.findElement(By.linkText("Product Category"));

        Actions five = new Actions(driver);

        five.moveToElement(elementfive).perform();

        WebElement iPods = driver.findElement(By.linkText("iPods"));

        five.moveToElement(iPods);

        five.click();

        five.perform();
        
        driver.findElement(By.xpath("//*[/html/body/div[2]/div/div/div/div/div[1]/article/header/h1]"));
    
	}
        
	@Test
	public void testProductCategory6() {
		
		WebElement elementsix = driver.findElement(By.linkText("Product Category"));

        Actions six = new Actions(driver);

        six.moveToElement(elementsix).perform();

        WebElement MacBooks = driver.findElement(By.linkText("MacBooks"));

        six.moveToElement(MacBooks);

        six.click();

        six.perform();
        
        driver.findElement(By.xpath("//*[/html/body/div[2]/div/div/div/div/div[1]/article/header/h1]"));
        
    
        
	}
	
	@Test
	public void testSearch() {
		
		
		driver.get("http://store.demoqa.com/");
		WebElement webElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/header/nav/form/fieldset/input[1]"));
		webElement.sendKeys(Keys.ENTER);		
	
		
		
	}
}
        
        

