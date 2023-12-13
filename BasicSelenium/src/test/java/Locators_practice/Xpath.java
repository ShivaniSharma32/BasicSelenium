package Locators_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		//Absolute Xpath
	/*	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div/ul/li/a")).click();
		WebElement radio1=driver.findElement(By.cssSelector("input[value=\"F\"]"));
		radio1.click();
		driver.findElement(By.cssSelector("[data-val-required=\"First name is required.\"]")).sendKeys("Shivani");
	    driver.findElement(By.cssSelector("[data-val-required=\"Last name is required.\"]")).sendKeys("Sharma");
	    driver.findElement(By.cssSelector("[data-val-email=\"Wrong email\"]")).sendKeys("shiva20@gmail.com");
	    driver.findElement(By.cssSelector("[data-val-length=\"The password should have at least 6 characters.\"]")).sendKeys("password1");
	    driver.findElement(By.cssSelector("[data-val-equalto=\"The password and confirmation password do not match.\"]")).sendKeys("password1");
	    driver.findElement(By.name("register-button")).click();*/
	    		
	
	
	    //relative path
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	    driver.findElement(By.xpath("//input[@value='F']")).click();
	    driver.findElement(By.xpath("//input[contains(@id,'FirstName')]")).sendKeys("Prachi");
	    driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys("Sharma");
	    driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("sh@gmail.com");
	    driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("1234556");
	    driver.findElement(By.xpath("//input[contains(@id,'ConfirmPassword')]")).sendKeys("123444");
	    driver.findElement(By.xpath("//input[contains(@value,'Register')]")).click();
	    Thread.sleep(2000);
	   String errormsg = driver.findElement(By.xpath("//span[contains(text(),'The password and')]")).getText();
	   System.out.println(errormsg);
	    
	}

}
