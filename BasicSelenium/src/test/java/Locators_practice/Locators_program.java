package Locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators_program {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//passing username value to webpage using cssSelector--Syntax 1- [AttributeName='AtrributeVaue"]
		driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("admin");
		
		
		
		//passing username value to webpage uing (id locator)
		/*driver.findElement(By.id("username")).sendKeys("admin");*/
		
		//passing password value to webpage uing (name locator)
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//clicking checkbox in the  webpage uing (id locator)
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		//clicking login button in the webpage using (id locator)
		/*driver.findElement(By.id("loginButton")).click();*/
		
		//clicking login button in the webpage using (classname locator)
		//driver.findElement(By.className("initial")).click();
		
		
		//passing username value to webpage using cssSelector--Syntax 2- html tag[AttributeName='AtrributeVaue"]
		driver.findElement(By.cssSelector("td[id=\"loginButtonContainer\"]")).click();
		
	Thread.sleep(2000);
	
	//clicking link text  in the webpage using (linkText locator)
		//driver.findElement(By.linkText("View Time-Track")).click();
	

	//clicking link text  in the webpage using (PartiallinkText locator)	
		driver.findElement(By.partialLinkText("View Ti")).click();
		
		
	}

}
