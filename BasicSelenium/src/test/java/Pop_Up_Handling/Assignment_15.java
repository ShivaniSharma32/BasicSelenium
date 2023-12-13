package Pop_Up_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_15 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver	=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
	driver.findElement(By.cssSelector("[for='keepLoggedInCheckBox']")).click();
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button popup_menu_button_se')]/div/div")).click();
	driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[onchange='nameChanged(this);']")).sendKeys("Sales Executive");
	driver.findElement(By.cssSelector("[onclick='handleCancel();']")).click();
	
	Alert ac = driver.switchTo().alert();
   System.out.println(ac.getText());
   Thread.sleep(2000);
   ac.accept();
   Thread.sleep(2000);
   driver.close();
	

	}

}
