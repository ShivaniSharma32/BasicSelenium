package Pop_Up_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload_ByUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Register now']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);",element);
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		 Robot rc = new Robot();
		 rc.keyPress(KeyEvent.VK_A);
		 rc.keyRelease(KeyEvent.VK_A);
		 Thread.sleep(2000);
		 rc.keyPress(KeyEvent.VK_DOWN);
		 rc.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 rc.keyPress(KeyEvent.VK_ENTER);
		 rc.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 driver.close();
		 
		 
		 
		 

	}

}
