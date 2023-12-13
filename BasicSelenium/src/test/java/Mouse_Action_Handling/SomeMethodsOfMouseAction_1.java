package Mouse_Action_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SomeMethodsOfMouseAction_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]"));
		Thread.sleep(3000);
		Actions ac= new Actions(driver);
		ac.moveToElement(element).perform();
		Thread.sleep(3000);
	
		WebElement option = driver.findElement(By.xpath("//ul[@class='sublist firstLevel active']/li[2]"));
		//ac.click(option).build().perform();
		//OR
		ac.moveToElement(option).click().perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
