package Pop_Up_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Assignment_16 {

	public static void main(String[] args) throws AWTException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver	driver =new ChromeDriver(opt);
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.barbequenation.com/");
		 Robot rc = new Robot();
		 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rc.keyRelease(KeyEvent.VK_UP);
		
		 driver.findElement(By.xpath("//span[@class='fa fa-facebook fa-lg']")).click();
		 driver.findElement(By.xpath("//span[@class='fa fa-twitter fa-lg']")).click();
		 driver.findElement(By.xpath("//span[@class='fa fa-instagram fa-lg']")).click();
		 driver.findElement(By.xpath("//span[@class='fa fa-youtube fa-lg']")).click();
		 
		Set<String> windowID = driver.getWindowHandles();
		for(String ID:windowID)
		{
			driver.switchTo().window(ID);
			System.out.println(driver.getCurrentUrl());
			
			if(driver.getCurrentUrl().equals("https://www.instagram.com/barbequenation/"))
			{
				System.out.println("Welcome to Instagram Page");
			}
			else
			{
				driver.close();
			}
		}

	}

}
