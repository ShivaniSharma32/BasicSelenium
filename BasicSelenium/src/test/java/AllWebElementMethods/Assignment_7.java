package AllWebElementMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_7 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://demo.actitime.com/login.do");
       driver.manage().window().fullscreen();
       
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[contains(text(),'Tasks')]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[contains(text(),'+ New Customer')]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//div[@class='customerNameDiv']//input[1]")).sendKeys("Shiva_Maharani_1");
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Hello This is Shivani Sharma");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[contains(text(),'Create Customer')]")).click();
       Thread.sleep(2000);
       WebElement Hovertext = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']//div[1]"));
      String Titletext = Hovertext.getAttribute("title");
      System.out.println(Titletext);
     Thread.sleep(2000);
   File src = Hovertext.getScreenshotAs(OutputType.FILE);
    File trg= new File("./Screenshots/Hovertext.png");
    FileHandler.copy(src, trg);
    Thread.sleep(2000);
    driver.close();
	}

		
	}

