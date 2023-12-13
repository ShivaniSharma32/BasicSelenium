package Locators_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Mana");
        
        driver.findElement(By.xpath("//table[@id='loginFormContainer']//label[@id='keepLoggedInLabel']")).click();

        //driver.findElement(By.xpath("//label[contains(@for,'keep')]")).click();
        
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        Thread.sleep(2000);
        
       String errorMessage = driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid.')]")).getText();
     System.out.println(errorMessage);
	}

}


