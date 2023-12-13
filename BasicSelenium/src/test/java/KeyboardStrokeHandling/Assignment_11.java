package KeyboardStrokeHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment_11 {

	//Autosuggestion program
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//String stg = "webdriver";
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("APjFqb")).click();
		Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 act.keyDown(Keys.SHIFT).sendKeys("Selenium").build().perform();
		 act.keyUp(Keys.SHIFT).perform();
		  Thread.sleep(2000);
		// List<WebElement> suggestions = driver.findElements(By.xpath("//ul[contains(@class,'erkvQe')]//li"));
		  List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		  
		 for(WebElement sugText:suggestions)
		 {
			 
		if (sugText.getText().equals("selenium webdriver"))
		{
			sugText.click();
			break;
		}
	}
Thread.sleep(2000);
	}
}

