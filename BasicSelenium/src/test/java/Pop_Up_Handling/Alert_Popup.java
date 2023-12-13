package Pop_Up_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver	driver =new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
   Alert ac = driver.switchTo().alert();
   Thread.sleep(2000);
   System.out.println(ac.getText());
   Thread.sleep(2000);
   ac.accept();
   driver.close();
	}
	

}
//button[text()='Click for JS Alert']