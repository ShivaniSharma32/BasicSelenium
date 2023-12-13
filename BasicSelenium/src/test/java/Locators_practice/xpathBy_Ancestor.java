package Locators_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathBy_Ancestor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://sso.godaddy.com/");
        
         
         driver.findElement(By.xpath("//button[@id='submitBtn']/ancestor::div[1]//div[1]")).sendKeys("doo");
         Thread.sleep(2000);
        
         
	}

}
