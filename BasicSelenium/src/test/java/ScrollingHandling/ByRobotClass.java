package ScrollingHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@title,'Show products in category Notebooks')]")).click();
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		rc.keyRelease(KeyEvent.VK_PAGE_UP);
        driver.close();
	}

}
