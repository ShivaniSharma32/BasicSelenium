package Locators_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_StaticandDyanmic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 //tagName locator --
		// driver.findElement(By.tagName("input")).sendKeys("book");
		 
		 
		 driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Jewelry')]")).click();
		 String price = driver.findElement(By.xpath("//a[text()='Create Your Own Jewelry']/../..//span")).getText();
		 System.out.println(price);
		 String actualprice ="100.00";
		 
		 //validating
		 if(actualprice.equals(price))
		 {
			 System.out.println("Testcase passed");
			 
		 }
		 else 
		 {
			 System.out.println("Testcase failed");
		 }
	}

}
