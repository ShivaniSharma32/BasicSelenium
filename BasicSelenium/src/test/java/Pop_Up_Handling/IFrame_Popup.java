package Pop_Up_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame_Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver	driver =new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://the-internet.herokuapp.com/iframe");
	 
	 
	 driver.switchTo().frame(0);
	 String text = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
	   System.out.println(text);
	 driver.switchTo().parentFrame();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Edit']")).click();
	 Thread.sleep(2000);
	 driver.close();
	 

	}

}
