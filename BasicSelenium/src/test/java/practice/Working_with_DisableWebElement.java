package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_DisableWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapp.skillrary.com/");
	
	Thread.sleep(2000);
	WebElement disabled = driver.findElement(By.xpath("//input[@class='form-control']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='selenium';",disabled);

	}

}
