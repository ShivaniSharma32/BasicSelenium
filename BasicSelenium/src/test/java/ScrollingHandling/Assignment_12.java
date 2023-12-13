package ScrollingHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_12 {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.selenium.dev/");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//li[@class='nav-item dropdown']")).click();
	 Thread.sleep(2000); 
	 driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[7]")).click();
	 
	 Thread.sleep(4000);
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	 Thread.sleep(2000);
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File trg = new File("./Screenshots/selenium.png");
	 FileHandler.copy(src, trg);
	}

}
