package Synchronization_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/login.do");
	   
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//Applicable for only to findElement and findElements
		
		
	   driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
	   driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
	   driver.findElement(By.cssSelector("[for='keepLoggedInCheckBox']")).click();
	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
	   driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	   driver.findElement(By.xpath("//div[text()='Add New']")).click();
	   driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	   WebElement name = driver.findElement(By.xpath("//div[@class='customerNameDiv']//input"));
	   name.sendKeys("Siteoojweai");// no need to give explicit wait .  
	  
	  
	   driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("She is a good girl");
	   
	   driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	   
	  // WebElement textA = driver.findElement(By.xpath("//div[@class='titleContainer']/div[2]"));
	  // System.out.println(textA.getText()); no need to give explicit wait . 
	   
	   WebElement textA = driver.findElement(By.xpath("//div[@class='titleContainer']/div[2]"));
	   String Heading = textA.getText();
		  System.out.println(Heading); //no need to give explicit wait . 
	   
	   
	   //String text = driver.findElement(By.xpath("//div[@class='titleContainer']/div[2]")).getText();
	   //System.out.println(text);  //no need to give explicit wait as we r finding webElement and taking value
	   
	   
	   WebElement title1 = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']//div[1]"));
		 
		System.out.println( title1.getCssValue("color"));
		Thread.sleep(2000);
		// need to give thread.sleep or explicit wait before getAttribute line as it is taking time to fetch the hover value.
		System.out.println( title1.getAttribute("title"));
		
		
		
	 //String titletext = title1.getAttribute("title");
	// System.out.println(titletext);
	  driver.close();
	}

}
