package Synchronization_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu

		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	  
	   driver.get("https://demo.actitime.com/login.do");
	   
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	   driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
	   driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
	   driver.findElement(By.cssSelector("[for='keepLoggedInCheckBox']")).click();
	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
	   driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	   driver.findElement(By.xpath("//div[text()='Add New']")).click();
	   driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	   driver.findElement(By.xpath("//div[@class='customerNameDiv']//input")).sendKeys("Sita ma");
	   driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("She is good girl");
	   driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	   //Thread.sleep(2000);
	   WebElement title1 = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']//div[1]"));
	   
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.textToBePresentInElement(title1, "Sita ma"));
	
	//String customername = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']//div[1]")).getText();	
	//System.out.println(customername);
	
	  String titletext = title1.getAttribute("title");
	  System.out.println(titletext);
	
	
	driver.findElement(By.id("logoutLink")).click();
	driver.close();
	}

}
