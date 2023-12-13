package Pop_Up_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class File_Upload_Popup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Register now']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(false);",element);
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\dell\\Desktop\\Akash Updated CV.docx");
	}

}
