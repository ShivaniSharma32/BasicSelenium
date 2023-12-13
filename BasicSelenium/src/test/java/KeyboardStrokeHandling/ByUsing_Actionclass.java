package KeyboardStrokeHandling;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByUsing_Actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		 Actions act = new Actions(driver);
		 
		 //act.sendKeys("java").perform(); //by default lowercase
		 //act.perform(); //by default lowercase
		 
		 act.keyDown(Keys.SHIFT).sendKeys("Selenium").build().perform();//for uppercase
		 act.keyDown(Keys.SHIFT).build().perform();//foruppercase
		
	}

}
