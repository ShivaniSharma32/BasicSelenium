package MultipleWebElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllTextPresent {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
 
		driver.findElement(By.xpath("//ul[contains(@class,'top-menu')]//li[4]")).click();
		//Fetch the name of the product
		//List<WebElement> AllText = driver.findElements(By.xpath("//div[@class='product-grid']//a"));
		
		//Fetch the price of the Product 
		//List<WebElement> AllPrice = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//span"));
		
		//Fetch both the name and price of the product ..(details)
		List<WebElement> AllPrice = driver.findElements(By.xpath("//div[contains(@class,'details')]"));
		
		
		for(WebElement Text:AllPrice)
		{
			System.out.println(Text.getText());
		}
		
	}

}
