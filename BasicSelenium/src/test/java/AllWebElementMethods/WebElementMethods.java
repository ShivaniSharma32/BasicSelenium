package AllWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();
        WebElement SearchTextElement = driver.findElement(By.id("APjFqb"));
        SearchTextElement.sendKeys("Virat");
        Thread.sleep(2000);
        SearchTextElement.clear();
        Thread.sleep(2000);
        SearchTextElement.sendKeys("Dhoni");
        SearchTextElement.submit();
		
	}

}
