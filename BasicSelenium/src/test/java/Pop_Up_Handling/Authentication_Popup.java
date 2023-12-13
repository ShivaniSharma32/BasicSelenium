package Pop_Up_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String message = driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! You must have the proper credentials.')]")).getText();
         System.out.println(message);
         driver.close();
	}

}
