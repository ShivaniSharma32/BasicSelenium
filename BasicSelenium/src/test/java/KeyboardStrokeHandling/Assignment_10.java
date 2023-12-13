package KeyboardStrokeHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_10 {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("APjFqb")).click();
		Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 act.keyDown(Keys.SHIFT).sendKeys("Selenium").build().perform();
		  Thread.sleep(2000);
		 List<WebElement> suggestions = driver.findElements(By.xpath("//ul[contains(@class,'G43f7e')]//b"));
		 for(WebElement sugText:suggestions)
		 {
			String d = sugText.getText();
			System.out.println(d);
			 }	 
	}

}
