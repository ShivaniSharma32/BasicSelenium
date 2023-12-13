package ScrollingHandling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment13 {


	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[contains(text(),'Companies')]")).click();
		 Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		 js.executeScript("arguments[0].scrollIntoView(true);",element);
		// js.executeScript("window.scrollBy(1310,582);");
		
		 Thread.sleep(2000);
       TakesScreenshot ts = (TakesScreenshot)driver;
       File src = ts.getScreenshotAs(OutputType.FILE);
      File trg = new File("./Screenshots/NextOptionScreen1.png");
      FileHandler.copy(src, trg);
      
	}	
	}


