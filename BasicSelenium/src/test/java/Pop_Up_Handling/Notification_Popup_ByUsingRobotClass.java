package Pop_Up_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Popup_ByUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver	driver =new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
      Robot rc = new Robot();
      rc.keyPress(KeyEvent.VK_TAB);
      rc.keyRelease(KeyEvent.VK_TAB);
      Thread.sleep(2000);
      rc.keyPress(KeyEvent.VK_TAB);
      rc.keyRelease(KeyEvent.VK_TAB);
      Thread.sleep(2000);
      rc.keyPress(KeyEvent.VK_TAB);
      rc.keyRelease(KeyEvent.VK_TAB);
      Thread.sleep(2000);
      rc.keyPress(KeyEvent.VK_ENTER);
      Thread.sleep(2000);
	}

}
