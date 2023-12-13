package Pop_Up_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_popup {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
	WebDriver	driver =new ChromeDriver(opt);
	driver.get("https://www.easemytrip.com/");
	
	
	// By using Robot Class we can handle this notification popup.
       
	}

}
