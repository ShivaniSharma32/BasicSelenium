package Locators_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathBy_Start_With {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//ul[starts-with(@class,'list')]//li[5]")).click();
	     Thread.sleep(2000);
		driver.close();
		
		
	}

}
