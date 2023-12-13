package Pop_Up_Handling;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_17 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		String mainID = driver.getWindowHandle();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,300);");
		
		driver.switchTo().frame("iframe_a");
		Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[contains(@class,'td')]//b[1]/a")).click();
		
		Thread.sleep(2000);
        
		

   
       Set<String> AllID = driver.getWindowHandles();
      for(String ID :AllID)
      {
    	   driver.switchTo().window(ID);
    	  System.out.println(driver.getTitle());
    	  if(driver.getTitle().equals("FreshersNow Test Series | 100% Free Mock Tests"))
    	  {
    		  //driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[2]")).click();
    		  //Thread.sleep(2000);
    		// driver.close();
    		  
    		  //OR
    		  break;
    	  }
    	 
      }
      driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[2]")).click();
	  Thread.sleep(2000);
	  driver.close();
        Thread.sleep(2000);
        driver.switchTo().window(mainID);
        driver.close();
	}

}
