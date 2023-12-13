package AllWebElementMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment_8 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		   WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       driver.findElement(By.xpath("//span[@role='button']")).click();
	       Thread.sleep(2000);
	       WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
	       searchbox.sendKeys("iphones");
	       searchbox.submit();
	       
	       TakesScreenshot ts=(TakesScreenshot) driver;
	       File src = ts.getScreenshotAs(OutputType.FILE);
	       File trg= new File("./Screenshots/flipkart.png");
	       FileHandler.copy(src, trg);
	       Thread.sleep(2000);
	       driver.close();

	}

}
