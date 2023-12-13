package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVG_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//button[text()='Not now']")).click();
	    driver.switchTo().parentFrame();
	   // driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_i']/*[name()='path']")).click();
		
		
	}

}
