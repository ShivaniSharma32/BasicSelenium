package KeyboardStrokeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByUsing_Keyclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("APjFqb")).sendKeys("Selenium",Keys.ENTER);
		
	}

}
