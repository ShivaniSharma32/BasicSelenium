package MultipleWebElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment_9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
		
		WebElement SearchBox = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, B')]"));
		SearchBox.sendKeys("iphone");
		SearchBox.submit();
		
		Thread.sleep(2000);
		List<WebElement> ProductName = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
		
		for(WebElement PName:ProductName)
		{
			System.out.println(PName.getText());
		}
      driver.close();
	}

}
