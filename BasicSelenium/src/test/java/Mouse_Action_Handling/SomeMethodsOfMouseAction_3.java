package Mouse_Action_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SomeMethodsOfMouseAction_3 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	//Thread.sleep(3000);
	Actions ac= new Actions(driver);
      //to perform Right click 
	//ac.contextClick(rightclick).perform();
	ac.moveToElement(rightclick).contextClick().perform();
	Thread.sleep(3000);
	ac.click(rightclick).perform();
	Thread.sleep(3000);
	
	WebElement doubleclick1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Thread.sleep(3000);
	//ac.doubleClick(doubleclick1).perform();
	//OR
	ac.moveToElement(doubleclick1).doubleClick().perform();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	driver.close();
	}
}